package com.example.jeanramos.cresspo_app.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.jeanramos.cresspo_app.R;
import com.example.jeanramos.cresspo_app.models.Product;

import java.util.ArrayList;

public class ListaProductosActivity extends AppCompatActivity {
    ListView listViewProducts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_productos);

        listViewProducts = (ListView) findViewById(R.id.listViewProducts);

        ArrayList<String> items = Product.getProductsAsString();

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);

        listViewProducts.setAdapter(itemsAdapter);
    }
}
