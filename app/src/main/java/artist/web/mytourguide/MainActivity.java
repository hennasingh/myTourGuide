package artist.web.mytourguide;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.image_kerala) ImageView image_kerala;
    @BindView(R.id.image_goa) ImageView image_goa;
    @BindView(R.id.image_paris) ImageView image_paris;
    @BindView(R.id.image_zurich) ImageView image_zurich;
    @BindView(R.id.image_dublin) ImageView image_dublin;
    @BindView(R.id.image_prague) ImageView image_prague;

    public static List<Tours> tourList;
    public static List<Cities> cityKerala,cityGoa,cityDublin,cityParis,cityPrague,cityZurich;
    public static List<Places> dineGoa,dineParis,sightsKerala,sightsZurich;
    private Context c = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        tourList = new ArrayList<Tours>();

        image_kerala.setOnClickListener(this);
        image_goa.setOnClickListener(this);
        image_paris.setOnClickListener(this);
        image_zurich.setOnClickListener(this);
        image_dublin.setOnClickListener(this);
        image_prague.setOnClickListener(this);

        // Create and populate tables if they do not exist
        insertCitiesRecords();
        insertSightPlacesRecords();
        insertDinePlacesRecords();

        tourList.add(new Tours("Dublin to Galway",R.drawable.galway,"10 hours", 50,3.5f,getString(R.string.dubtogal)));
        tourList.add(new Tours("Dublin to Belfast",R.drawable.belfast,"11 hours", 70,4, getString(R.string.dubtobel)));
        tourList.add(new Tours("Paris Charms & Secrets",R.drawable.parischarms,"5 hours", 30,3.5f, getString(R.string.parischarms)));
        tourList.add(new Tours("Paris: Taste of Montmarte",R.drawable.parismontmartre,"3 hours", 90,5,getString(R.string.parisfood)));
        tourList.add(new Tours("Zurich Cruise Trip",R.drawable.zurich_cruise,"10 hours", 75,4, getString(R.string.zurichcruise)));
        tourList.add(new Tours("Prague Riverside Party",R.drawable.prague_riverside,"4 hours", 25,5,getString(R.string.pragueriver)));

        TourAdapter tourAdapter = new TourAdapter(this,tourList);
        ListView toursListView = (ListView)findViewById(R.id.listview_tours);

        toursListView.setAdapter(tourAdapter);

        toursListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(),TourDetailsActivity.class);
                    intent.putExtra("position", position);
                    startActivity(intent);
            }
        });
     }

    public void onClick (View view){

         switch (view.getId()) {
            case R.id.image_kerala:
                openCityActivity("Kerala");
                break;
            case R.id.image_goa:
                openCityActivity("Goa");
                break;
            case R.id.image_paris:
                openCityActivity("Paris");
                break;
            case R.id.image_prague:
                openCityActivity("Prague");
                break;
            case R.id.image_zurich:
                openCityActivity("Zurich");
                break;
            case R.id.image_dublin:
               openCityActivity("Dublin");
                break;
        }
    }

    private void openCityActivity(String selectedCity) {

        Intent i = new Intent(getApplicationContext(), CityActivity.class);

        i.putExtra("city", selectedCity);
        startActivity(i);

    }

    private void insertCitiesRecords(){

        //City Kerala
         cityKerala = new ArrayList<Cities>();
        cityKerala.add(new Cities(c.getString(R.string.kerala_country),
                c.getString(R.string.kerala_description),
                c.getString(R.string.kerala_attractions),
                c.getString(R.string.kerala_specialities),
                c.getString(R.string.kerala_language)));

        //City Goa
        cityGoa = new ArrayList<Cities>();
        cityGoa.add(new Cities(c.getString(R.string.goa_country),
                c.getString(R.string.goa_description),
                c.getString(R.string.goa_attractions),
                c.getString(R.string.goa_specialities),
                c.getString(R.string.goa_language)));

        //City Dublin
        cityDublin = new ArrayList<Cities>();
        cityDublin.add(new Cities(c.getString(R.string.dublin_country),
                c.getString(R.string.dublin_description),
                c.getString(R.string.dublin_attractions),
                c.getString(R.string.dublin_specialities),
                c.getString(R.string.dublin_language)));

        //City Paris
        cityParis = new ArrayList<Cities>();
        cityParis.add(new Cities(c.getString(R.string.paris_country),
                c.getString(R.string.paris_description),
                c.getString(R.string.paris_attractions),
                c.getString(R.string.paris_specialities),
                c.getString(R.string.paris_language)));

        //City Prague
        cityPrague = new ArrayList<Cities>();
        cityPrague.add(new Cities(c.getString(R.string.prague_country),
                c.getString(R.string.prague_description),
                c.getString(R.string.prague_attractions),
                c.getString(R.string.prague_specialities),
                c.getString(R.string.prague_language)));

        //City Zurich
        cityZurich = new ArrayList<Cities>();
        cityZurich.add(new Cities(c.getString(R.string.zurich_country),
                c.getString(R.string.zurich_description),
                c.getString(R.string.zurich_attractions),
                c.getString(R.string.zurich_specialities),
                c.getString(R.string.zurich_language)));
    }

    private void insertSightPlacesRecords(){

        //Sight Seeing Places - Kerala
        sightsKerala = new ArrayList<Places>();
        sightsKerala.add(new Places(
                "Periyar National Park",
                "Thekkady in the districts of ldukki,Kottayam",
                R.drawable.periyar,
                4));
        sightsKerala.add(new Places(
                "Western Ghats",
                "Anamudi,Kerala(Eravikulam National Park",
                R.drawable.western,
                4));
        sightsKerala.add(new Places(
                "Bekal Fort",
                "Bekal Village,Kasaragod District,Kerala",
                R.drawable.bekal,
                3.5f));
        sightsKerala.add(new Places(
                "Athirappilly Falls",
                " Chalakudy Thaluk, Thrissur,Kerala",
                R.drawable.athirapally,
                3.5f));
        sightsKerala.add(new Places(
                "Edakkal Caves",
                "Wayanad,Kerala",
                R.drawable.edakkal,
                4));
        sightsKerala.add(new Places(
                "Mattancherry Palace",
                " Cochin,Kerala",
                R.drawable.mattancherry,
                3));
        sightsKerala.add(new Places(
                "Cherai Beach",
                "Kochi Taluk, Kerala",
                R.drawable.cherai,
                3.5f));
        sightsKerala.add(new Places(
                "Vembanad",
                "Kochi, Kerala",
                R.drawable.vembanad,
                4));

        //sights seeing places in Zurich

        sightsZurich = new ArrayList<Places>();

        sightsZurich.add(new Places(
                "Lake Zurich",
                "South-east of Zurich",
                R.drawable.lakezurich,
                4));
        sightsZurich.add(new Places(
                "Swiss National Museum",
                "Zurich, next to Hauptbahnhof",
                R.drawable.swissmuseum,
                4));
        sightsZurich.add(new Places(
                "Sihl, Swiss River",
                "canton of Schwyz to Limmat, Zurich",
                R.drawable.sihl,
                3));
        sightsZurich.add(new Places(
                "Zürich Zoologischer Garten",
                "Zürichbergstrasse, Zürichberg",
                R.drawable.swissgarten,
                4));
        sightsZurich.add(new Places(
                "Zurich Opera House",
                "Sechseläutenplatz, Zurich",
                R.drawable.zurichopera,
                4));
        sightsZurich.add(new Places(
                "Zürich Tram Museum",
                "Zurich City",
                R.drawable.swisstram,
                3));


    }

    private void insertDinePlacesRecords(){

        //City- Paris
        dineParis = new ArrayList<Places>();

        dineParis.add(new Places(
                "ASPIC",
                "24,rue de la Tour D Auvergne,75009,Paris",
                R.drawable.aspicparis,
                3.5f));
        dineParis.add(new Places(
                "Epicure",
                "112 Rue Du Faubourg Sain-Honore Le Bristol, Paris",
                R.drawable.epicure,
                4.5f));
        dineParis.add(new Places(
                "L'Abeille",
                "10, Avenue d'lena Shangri-La Hotel,Paris",
                R.drawable.labeille,
                3.5f));
        dineParis.add(new Places(
                "Boutary",
                "25 rue Mazarine,Paris",
                R.drawable.boutary,
                3.5f));
        dineParis.add(new Places(
                "Le cinq",
                "31, Avenue George,Four Seasons Hotel George V,Paris",
                R.drawable.lecinq,
                3.5f));

        //City - Goa
        dineGoa = new ArrayList<Places>();

        dineGoa.add(new Places(
                "Nick's Place",
                "Arpora, Goa",
                 R.drawable.nicks,
                3.5f));
        dineGoa.add(new Places(
                "Earthen Oven",
                "Candolim, Goa",
                R.drawable.earthen,
                4));
        dineGoa.add(new Places(
                "La Plage",
                "Mandrem, Goa",
                R.drawable.laplage,
                4.5f));
        dineGoa.add(new Places(
                "Spice Goa",
                "Mapusa, Goa",
                R.drawable.spicegoa,
                4.5f));
        dineGoa.add(new Places(
                "Black Sheep Bistro",
                "Panjim, Goa",
                R.drawable.bistro,
                4.5f));
        dineGoa.add(new Places(
                "Thalassa",
                "Vagator Beach, Goa",
                R.drawable.thalassa,
                4.5f));

    }





}
