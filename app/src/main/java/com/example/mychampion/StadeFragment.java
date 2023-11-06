package com.example.mychampion;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.mychampion.databinding.ActivityStadeFragmentBinding;

public class StadeFragment extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityStadeFragmentBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_stade_fragment, container, false);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        return view ;
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng StadeAbdoulayeWade = new LatLng(14.732567277580971, -17.200997324534235);
        mMap.addMarker(new MarkerOptions().position(StadeAbdoulayeWade).title("StadeAbdoulayeWade").snippet("Contact: 773252312, Site: stadeAW.sn"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(StadeAbdoulayeWade,13));

        // Add a marker in Sydney and move the camera
        LatLng StadeNgalandouDiouf = new LatLng(14.72715940200312, -17.281625213985933);
        mMap.addMarker(new MarkerOptions().position(StadeNgalandouDiouf).title("StadeNgalandouDiouf").snippet("Contact: 773452312, Site: ngalandou.sn"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(StadeNgalandouDiouf,13));

        // Add a marker in Sydney and move the camera
        LatLng  StadeAlassaneDjigo = new LatLng(14.755273280661331, -17.393301384681767);
        mMap.addMarker(new MarkerOptions().position(StadeAlassaneDjigo).title("StadeAlassaneDjigo").snippet("Contact: 703452312, Site: stadedjigo.sn"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(StadeAlassaneDjigo,13));

        // Add a marker in Sydney and move the camera
        LatLng  StadeCarolineFaye = new LatLng(14.755273280661331, -17.393301384681767);
        mMap.addMarker(new MarkerOptions().position(StadeCarolineFaye).title("StadeCarolineFaye").snippet("Contact: 763452312, Site: SCarolinefaye.sn"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(StadeCarolineFaye,13));
    }
}