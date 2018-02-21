package com.localknowledge.localknowledge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class CivilLaws extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_laws);

        setTitle("Civil Laws");

        ListView listView5 = (ListView) findViewById(R.id.listView5);
        ArrayList<String> lawCategory = new ArrayList<>(asList(
                "\nChildren in Need of Assistance, Guardianship, Adoption, Custody, and Visitation -- Blindness of Parent/Guardian (SB765):\n\n In cases with disabled parents, disabilities, including blindness, cannot discredit the parent unless proven that the disability is not in the best interest of the child.\n\n",
                "\nDivorce-Corroboration of Testimony (SB359, HB274):\n\n Reversing previous laws, this allows courts to enter decrees of divorce on behalf of one spouse without the agreement of the other. It also establishes that a separation agreement is no longer sufficient to show both spouses want an absolute divorce.\n\n",
                "\nTestimony by Perjurer (SB150, HB237):\n\n People who have been convicted of perjuring themselves, or lying under oath, will no longer be prohibited from testifying in court.\n\n"));

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,lawCategory);
        listView5.setAdapter(arrayAdapter);
    }
}
