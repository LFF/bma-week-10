package com.dsa.twelvedaysxmas;


import android.widget.Toast;
import android.os.Bundle;
import android.app.Activity;

import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	
	int dayA = 0;
	int dayB = 0;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		final String[] days = getResources().getStringArray(R.array.days);
	    
	final 	String[] gifts = getResources().getStringArray(R.array.lines);
	 
		
		setContentView(R.layout.activity_main);
	

    Button song = (Button) findViewById(R.id.button2);
    

    Button line = (Button) findViewById(R.id.button1);
    
    
    
   //-
        //--
        song.setOnClickListener(new View.OnClickListener() {
        	
        
			public void onClick(View v) {
				
				
				
				while ( dayA <= 12 )  {
				
        		
		      	 final android.content.Context context = getApplicationContext();
		      	 
		      	 
		        final CharSequence day  = "On the " + days[dayA] + " day of Christmas";
		        
		        
		        final int duration = Toast.LENGTH_SHORT;
		        
		    	 
		        final CharSequence line  = "My true love gave to me " + gifts[dayA] ;
		      
		        
		 	   Toast toast06 = Toast.makeText(context, day, duration);
		        
				Toast toast07 = Toast.makeText(context, line, duration);
			  
		 	   
		 	       toast06.show();
		 	      toast07.show();
  		 	       
		 	       
		        
		   	   dayA++;
		   	   
		   	   
				}
				
			
				
       	}	
        }	
				
        	);
        
        
        
         
        
        line.setOnClickListener(new View.OnClickListener() {
        	
            
    			public void onClick(View v) {
    	   		
   		      	 final android.content.Context context = getApplicationContext();
   		      	 
   		      	 
   		        final CharSequence day  = "On the " + days[dayB] + " day of Christmas!";
   		        
   		        
   		        final int duration = Toast.LENGTH_SHORT;
   		        
   		    	 
   		        final CharSequence line  = "My true love gave to me " + gifts[dayB] ;
   		      
   		        
   		 	   Toast toast06 = Toast.makeText(context, day, duration);
   		        
   				Toast toast07 = Toast.makeText(context, line, duration);
   			  
   		 	   
   		 	       toast06.show();
   		 	   toast07.show();
		 	       
   		        
   		   	   dayB++;
   					
            	
            }
	
	
	});
        
       
	}
	
	
}
