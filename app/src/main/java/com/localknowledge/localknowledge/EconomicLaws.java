package com.localknowledge.localknowledge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class EconomicLaws extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_economic_laws);

        setTitle("Economic Laws");

        ListView listView3 = (ListView) findViewById(R.id.listView3);
        ArrayList<String> lawCategory = new ArrayList<>(asList(
                "\nEqual Pay for Equal Work (SB 481):\n\n An expansion of the current law, this legislation prohibits employers from paying employees of one gender identity at a lesser rate than other employees. The bill also states that employers may not prohibit employees from discussing or disclosing salaries.\n\n",
                "\nMinimum Wage for the Disabled (SB 417):\n\n Starting Oct. 1, the Commissioner of Labor and Industry cannot authorize a work activities center or other sheltered workshop to pay an employee with a disability a subminimum wage unless granted prior permission to do so. Until Oct. 1, 2020, however, employers with prior permission may continue to do so. Afterward, no employer -- under any circumstance -- can pay a subminimum wage to a disabled employee.\n\n",
                "\nApprenticeships (SB 92):\n\n Members of the Maryland Apprenticeships and Training Council and its consultants must reflect geographic, racial, ethnic, cultural and gender diversity within the state.\n\n"));

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,lawCategory);
        listView3.setAdapter(arrayAdapter);





    }
}
