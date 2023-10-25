package com.example.googlemaps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener {

    EditText txtLatitud, txtLongitud; // Declarar e inicializar variables
    GoogleMap mMap; // Objeto GoogleMap que se usará para interactuar con el mapa

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLatitud = findViewById(R.id.txt_latitud);
        txtLongitud = findViewById(R.id.txt_longitud);

        // Llamar fragmento de mapa para asegurar que el mapa esté listo para su uso
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);
    }

    // Este método se llama cuando el mapa está listo
    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setOnMapClickListener(this);
        mMap.setOnMapLongClickListener(this);

        LatLng arica = new LatLng( -18.4746, -70.29792);
        LatLng iquique = new LatLng( -20.21326, -70.15027);
        LatLng antofagasta = new LatLng(  -23.65236, -70.3954);
        LatLng laSerena = new LatLng(  -29.90453, -71.24894);
        LatLng viñaDelMar = new LatLng(  -33.02457, -71.55183);
        LatLng santiago = new LatLng(  -33.45694, -70.64827);
        LatLng talca = new LatLng(  -35.4264, -71.65542);
        LatLng concepcion = new LatLng(  -36.82699, -73.04977);
        LatLng losAngeles = new LatLng(  -37.46973, -72.35366);
        LatLng temuco = new LatLng(  -38.73965, -72.59842);
        LatLng valdivia = new LatLng(  -39.81422, -73.24589);
        LatLng osorno = new LatLng(   -40.57395, -73.13348);
        LatLng puertoMontt = new LatLng(   -41.4693, -72.94237);




        mMap.addMarker(new MarkerOptions().position(arica).title("Santo Tomas Arica"));
        mMap.addMarker(new MarkerOptions().position(iquique).title("Santo Tomas Iquique"));
        mMap.addMarker(new MarkerOptions().position(antofagasta).title("Santo Tomas Antofagasta"));
        mMap.addMarker(new MarkerOptions().position(laSerena).title("Santo Tomas La Serena"));
        mMap.addMarker(new MarkerOptions().position(viñaDelMar).title("Santo Tomas Viña del Mar"));
        mMap.addMarker(new MarkerOptions().position(santiago).title("Santo Tomas Santiago"));
        mMap.addMarker(new MarkerOptions().position(talca).title("Santo Tomas Talca"));
        mMap.addMarker(new MarkerOptions().position(concepcion).title("Santo Tomas Concepcion"));
        mMap.addMarker(new MarkerOptions().position(losAngeles).title("Santo Tomas Los Angeles"));
        mMap.addMarker(new MarkerOptions().position(temuco).title("Santo Tomas Temuco"));
        mMap.addMarker(new MarkerOptions().position(valdivia).title("Santo Tomas Valdivia"));
        mMap.addMarker(new MarkerOptions().position(osorno).title("Santo Tomas Osorno"));
        mMap.addMarker(new MarkerOptions().position(puertoMontt).title("Santo Tomas Puerto Montt"));



        mMap.moveCamera(CameraUpdateFactory.newLatLng(arica));


    }

    // Implementa los métodos OnMapClick y OnMapLongClick aquí
    @Override
    public void onMapClick(LatLng latLng) {
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);
    }

    @Override
    public void onMapLongClick(LatLng latLng) {
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);
    }

    public void Multimedia(View v){
        Intent horizontal = new Intent(this, Multimedia.class);
        startActivity(horizontal);
    }

}