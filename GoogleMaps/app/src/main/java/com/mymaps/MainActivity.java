package com.mymaps;

import android.app.Activity;
import android.graphics.Color;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MainActivity extends Activity implements OnMapReadyCallback, LocationListener {
    GoogleMap map;
    LocationManager locationManager;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		
        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.googlemaps);
        mapFragment.getMapAsync(this);

      }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
		
		//Mark Oliver Home
		LatLng markoliver = new LatLng(16.257527,120.480494);
		
		LatLng kaymito = new LatLng(16.257891,120.480413);
		LatLng whitengshed = new LatLng(16.257946,120.480602);
		LatLng purok3 = new LatLng(16.256135,120.481233);
		LatLng purok1 = new LatLng(16.253189,120.481626);
		LatLng pugoroad = new LatLng(16.247130,120.481961);
		LatLng fuelstation = new LatLng(16.235695,120.486914);
		LatLng markarthurhighway = new LatLng(16.225159,120.500683);
		LatLng Rosariointegratedschool= new LatLng(16.229628,120.488319);
		LatLng Rosariojunctionpolicestation = new LatLng(16.224020,120.503618);
		LatLng pepsicola = new LatLng(16.211258,120.503092);
		LatLng blueridge = new LatLng(16.207646,120.511474);
		LatLng agat = new LatLng(16.204566,120.513457);
		LatLng JeasEatery = new LatLng(16.201416,120.514533);
		LatLng tulay = new LatLng(16.196995,120.514905);

		
		
		//joy malqued home
		LatLng joy = new LatLng(16.196849,120.513527);
		
		LatLng AudreEatery = new LatLng(16.178565,120.515111);
		LatLng NiceEatery = new LatLng(16.166667,120.520216);
		LatLng Markarthurhighway = new LatLng(16.136896,120.525077);
		LatLng Petron = new LatLng(16.118615,120.540978);
		LatLng Andoks = new LatLng(16.116082,120.543649);
		LatLng NovoEcijano = new LatLng(16.108880,120.554977);
		LatLng SalguetfredaS = new LatLng(16.106055,120.566388);
		LatLng Karenjoystore = new LatLng(16.090834,120.576951);
		LatLng Puertoparaisoresort = new LatLng(16.086372,120.579185);
		//Artacho National High School, Sison St, Urdaneta, Pangasinan
		LatLng artachonationalhigschool = new LatLng(15.974511,120.571835);
		LatLng Cesflorescollection = new LatLng(16.074127,120.587542);
		LatLng LizadasResidential = new LatLng(16.069920,120.589270);
		LatLng MangCasuyRoad= new LatLng(16.061219,120.589537);
		LatLng Jollibeebinalonan = new LatLng(16.046742,120.586325);
		LatLng Tplex = new LatLng(15.990943,120.573627);
		LatLng Tplexcurve = new LatLng(15.993693,120.557872);
		LatLng UrdanetaManaogRoad = new LatLng(15.984507,120.555692);
		LatLng Gateucu= new LatLng(15.981641,120.560414);

		//Urdaneta City University
		LatLng ucu = new LatLng(15.980656,120.560387);
		
		
		
//circle URDANETA CITY UNIVERSITY
		map.addCircle(new CircleOptions()
					  .center(new LatLng(15.980656,120.560387))
					  .radius(400)
					  .strokeWidth(4)
					  .strokeColor(Color.BLUE)
					  .fillColor(Color.argb(102, 102, 51, 0)));

		
		
		
		//joyhome
	    map.addMarker(new MarkerOptions().position(joy).
		title("Joy Malqued Home").
		snippet("16.196849,120.513527"));
        map.moveCamera(CameraUpdateFactory.newLatLng(joy));
		
		
		
		

		//circle joyhome
		map.addCircle(new CircleOptions()
					  .center(new LatLng(16.196849,120.513527))
					  .radius(70)
					  .strokeWidth(4)
					  .strokeColor(Color.BLACK)
					  .fillColor(Color.argb(102, 102, 51, 0)));

		
		
		
		//circle Artacho National High School, Sison St, Urdaneta, Pangasinan
		map.addCircle(new CircleOptions()
					  .center(new LatLng(15.974511,120.571835))
					  .radius(70)
					  .strokeWidth(4)
					  .strokeColor(Color.BLACK)
					  .fillColor(Color.argb(102, 102, 51, 0)));

		
		
		map.addMarker(new MarkerOptions().position(artachonationalhigschool).
		title("Artacho National High School, Sison St, Urdaneta, Pangasinan").
	    snippet("Joy Malqued SHS"));
        map.moveCamera(CameraUpdateFactory.newLatLng(artachonationalhigschool));
		
			
		
		//oliverhome
	    map.addMarker(new MarkerOptions().position(markoliver).
		title("Mark Oliver Home").
		snippet("16.257527,120.480494"));
        map.moveCamera(CameraUpdateFactory.newLatLng(markoliver));
		
		//rosariointegrated school
		map.addMarker(new MarkerOptions().position(Rosariointegratedschool).
		title("Rosario Integrated School").
        snippet("Mark Oliver Dulay SHS"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Rosariointegratedschool));
		
		
		
		
		
		
		//polyline Mark Oliver
		map.addPolyline(new PolylineOptions()
						.add(new LatLng(16.257527,120.480494),
							 new LatLng(16.257891,120.480413),
							 new LatLng(16.257946,120.480602),
		                     new LatLng(16.256135,120.481233),
							 new LatLng(16.253189,120.481626),
							 new LatLng(16.247130,120.481961),
							 new LatLng(16.235695,120.486914),
		                     new LatLng(16.225159,120.500683),
		                     new LatLng(16.224020,120.503618),
							 new LatLng(16.211258,120.503092),
							 new LatLng(16.207646,120.511474),
							 new LatLng(16.204566,120.513457),
							 new LatLng(16.201416,120.514533),
		                     new LatLng(16.196995,120.514905),
							 new LatLng(16.196849,120.513527),
		                     new LatLng(16.196995,120.514905),
		                     new LatLng(16.178565,120.515111),
							 new LatLng(16.166667,120.520216),
							 new LatLng(16.136896,120.525077),
							 new LatLng(16.118615,120.540978),
							 new LatLng(16.116082,120.543649),
							 new LatLng(16.108880,120.554977),
							 new LatLng(16.106055,120.566388),
							 new LatLng(16.090834,120.576951),
							 new LatLng(16.086372,120.579185),
							 new LatLng(16.074127,120.587542),
							 new LatLng(16.069920,120.589270),
							 new LatLng(16.061219,120.589537),
							 new LatLng(16.046742,120.586325),
							 new LatLng(15.990943,120.573627),
							 new LatLng(15.993693,120.557872),
							 new LatLng(15.984507,120.555692),
							 new LatLng(15.981641,120.560414),
							 new LatLng(15.980656,120.560387))
							 
							 .width(4)
							 .color(Color.RED));					 						 
							 
		//circle markoliver
		map.addCircle(new CircleOptions()
					  .center(new LatLng(16.257527,120.480494))
						   .radius(150)
						   .strokeWidth(4)
						   .strokeColor(Color.YELLOW)
					  .fillColor(Color.argb(102, 102, 51, 0)));
		
	

		//circle rosario integratedschool
		map.addCircle(new CircleOptions()
					  .center(new LatLng(16.229628,120.488319))
					  .radius(150)
					  .strokeWidth(4)
					  .strokeColor(Color.YELLOW)
					  .fillColor(Color.argb(102, 102, 51, 0)));

					  
					  
					  
					  
		//Mark Dumlao
		LatLng Dumlaohome = new LatLng(16.037259,120.634477);
		
		LatLng BubonanelEmentarySchool = new LatLng(16.037555,120.635242);
		LatLng BinalonanAsinganRoad = new LatLng(16.026819,120.632936);
		LatLng BinalonanAsinganRoad1 = new LatLng(16.028191,120.629394);
		LatLng AsinganSatelitemarket = new LatLng(16.024626,120.624827);
		LatLng Squibfamily = new LatLng(16.009033,120.613221);
		LatLng Bulaoen = new LatLng(16.008540,120.602186);
		LatLng CayambannRoad = new LatLng(15.991759,120.585450);
		LatLng BrgySanVicenteRoad = new LatLng(15.987194,120.581964);
		LatLng BitoyRestoBar = new LatLng(15.979189,120.570538);
		LatLng JcGasHouse = new LatLng(15.978882,120.565796);
		LatLng seveneleven = new LatLng(15.981750,120.560148);
		
		//Urdaneta City University
		LatLng ucu1 = new LatLng(15.980656,120.560387);
		
		
		
		
		//dumlaohome
	    map.addMarker(new MarkerOptions().position(Dumlaohome).
		title("Mark Dumlao Home").
		snippet("16.037259,120.634477"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Dumlaohome));
		
		//ucu
		map.addMarker(new MarkerOptions().position(ucu).
		title("Urdaneta City University").
		snippet("15.980656,120.560387"));
        map.moveCamera(CameraUpdateFactory.newLatLng(ucu));
		
		
		
		//Toboy National High School, Asingan, Pangasinan
	    LatLng DumlaoSHS = new LatLng(16.027234,120.635256);
		map.addMarker(new MarkerOptions().position(DumlaoSHS).
	    title("Toboy National High School, Asingan, Pangasinan").
		snippet("Mark Dumlao SHS"));
		
		map.moveCamera(CameraUpdateFactory.newLatLng(DumlaoSHS));
		
		
		//polyline Mark Dumlao
		map.addPolyline(new PolylineOptions()
						.add(new LatLng(16.037259,120.634477),
							 new LatLng(16.037555,120.635242),
							 new LatLng(16.026819,120.632936),
							 new LatLng(16.028191,120.629394),
		                     new LatLng (16.024626,120.624827),
							 new LatLng(16.009033,120.613221),
							 new LatLng(16.008540,120.602186),
		                     new LatLng(15.991759,120.585450),
		                     new LatLng(15.987194,120.581964),
		                     new LatLng(15.979189,120.570538),
		                     new LatLng(15.978882,120.565796),
		                     new LatLng(15.981750,120.560148),
		                     new LatLng(15.980656,120.560387))
							 .width(4)
						     .color(Color.RED));				
		
					  
					  

		//circle Mark Dumlao HOME
		map.addCircle(new CircleOptions()
					  .center(new LatLng(16.037259,120.634477))
					  .radius(150)
					  .strokeWidth(4)
					  .strokeColor(Color.RED)
					  .fillColor(Color.argb(102, 102, 51, 0)));
		
					  
					  
		//circle Mark Dumlao SHS
		map.addCircle(new CircleOptions()
					  .center(new LatLng(16.027234,120.635256))
					  .radius(150)
					  .strokeWidth(4)
					  .strokeColor(Color.RED)
					  .fillColor(Color.argb(102, 102, 51, 0)));

		
					  
		
		//Zoom in Zoom out
		map.getUiSettings().setZoomControlsEnabled(true);



//satelite

		map.setMapType(map.MAP_TYPE_SATELLITE); 


    }

	private void snippet(String p0)
	{
		// TODO: Implement this method
	}

    @Override
    public void onLocationChanged(Location location) {
        map.clear();
        LatLng currentLocation = new LatLng(location.getLatitude(), location.getLongitude());


        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(currentLocation);
        map.addMarker(markerOptions);


        map.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 150.0f));
    }


    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}


