package com.localknowledge.localknowledge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class CriminalLaws extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criminal_laws);

        setTitle("Criminal Laws");

        ListView listView4 = (ListView) findViewById(R.id.listView4);
        ArrayList<String> lawCategory = new ArrayList<>(asList(
                "\nProviding Alcohol to Underage Drinkers/Alex and Calvin’s Law (HB409):\n\n Following the death of Alex Murk and Calvin Li in a 2015 drunken-driving accident after a party in Montgomery County, this law prohibits a person from allowing underage individuals to consume alcohol if they should have known that individual would drive under the influence.\n\n",
                "\nJustice Reinvestment Act (SB1005):\n\n The law expands drug treatment in the state health department, and treatment for substance abuse and mental health through the corrections department, including risk and needs assessments to determine risks of reoffending. The law also calls for plans for inmate rehabilitation.\n\n",
                "\nPublic Safety and Policing Workgroup (HB1016):\n\n This law protects law enforcement officers from being penalized or retaliated against for disclosing information, and establishes the Maryland Police Training and Standards Commission within the Department of Public Safety and Correctional Services.\n\n",
                "\nSeizure and Forfeiture (SB161/HB336):\n\n This law outlines procedures for seizure and forfeiture of property from a vehicle or other location, such as notifying the owner that it has been seized, within a specific amount of time. The law also repeals a provision that allowed for the forfeiture of drug-related money and weapons.\n\n",
                "\nChild Abuse and Neglect (SB310, HB245):\n\n Anyone involved in an investigation of child abuse or neglect must report suspicions of another individual knowingly failing to report child abuse to the appropriate board, agency, institution or facility.\n\n",
                "\nCriminal Law-Stalking (SB278/HB155):\n\n This law expands the definition of stalker from inciting physical fears or threats to include causing emotional distress.\n\n",
                "\nPretrial Release-Prior Crime of Violence (SB604):\n\n A District Court commissioner may not authorize the pretrial release of defendants who have been convicted of a specified crime or a crime of violence.\n\n"));

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,lawCategory);
        listView4.setAdapter(arrayAdapter);


    }
}
