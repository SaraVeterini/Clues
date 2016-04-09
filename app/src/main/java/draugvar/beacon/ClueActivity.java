package draugvar.beacon;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sara on 26/03/2016.
 */
public class ClueActivity extends Activity{

    //id of the two beacons I use. Modify them or add others if you have other beacons
    //public static final String idFirstClue = "b9407f30-f5f8-466e-aff9-25556b57fe6d";
    public static final String idFirstClue = "2f234454-cf6d-4a0f-adf2-012345678901";
    public static final String idSecondClue = "2f234454-cf6d-4a0f-adf2-f4911ba9ffa6";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String id=getIntent().getStringExtra("id");
        setContentView(R.layout.activity_clue);
        TextView testo=(TextView)findViewById(R.id.testo);
        ImageView image=(ImageView)findViewById(R.id.immagine);
        if(id.equals(idFirstClue)){
            testo.setText("Look at this painting. What does it tell you about the door key?");
            image.setImageResource(R.drawable.clue1);
        }
        else if(id.equals(idSecondClue)){
            testo.setTextAppearance(this, android.R.style.TextAppearance_Medium);
            testo.setTextColor(getResources().getColor(android.R.color.white));
            testo.setText("Solve the enigma to find the password:" +
                    "\n" +
                    "1942, 2383, 3904, 4453, ...\n" +
                    "A) 5830  B) 5741  C) 5855  D) 6613  E) 6352");
            image.setImageResource(R.drawable.clue);
        }
    }
}
