package chinna.sandyz.com.mapassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private static final LatLng DAVAO = new LatLng(12.9699, 77.6499);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);



    }

    @Override
    public void onMapReady(GoogleMap map) {
        Marker davao = map.addMarker(new MarkerOptions().position(DAVAO).title("Indiranagar").snippet("Bangalore"));

        // zoom in the camera to Davao city
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(DAVAO, 15));

        // animate the zoom process
        map.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);

    }
}
