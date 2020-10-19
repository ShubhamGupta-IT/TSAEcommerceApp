package com.tsa.ecommerce.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;
import com.tsa.ecommerce.R;
import com.tsa.ecommerce.adapters.MainCategoryAdapter;
import com.tsa.ecommerce.fragments.HomeFragment;
import com.tsa.ecommerce.models.CategoryNameModel;
import com.tsa.ecommerce.repository.ViewCategory;

import java.util.ArrayList;

public class MainActivity extends MyBaseActivity {

    private AppBarConfiguration mAppBarConfiguration;
    RecyclerView categoryNameRecycler;
    ArrayList<CategoryNameModel> mainCategoryList;
    DrawerLayout drawer, drawer_layout_right;
    View view;
    TextView billing;
    NavigationView nav_view_right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        NavigationView navigationView = findViewById(R.id.nav_view);
        categoryNameRecycler = findViewById(R.id.mainCategoryRecycler);
        //    billing=findViewById(R.id.manageAddress);

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
     /*   mAppBarConfiguration = new AppBarConfiguration.Builder(R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow).setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);         */

        ft.replace(R.id.nav_host_fragment, new HomeFragment());
        ft.commit();

        loadMainCategory(MainActivity.this);


        //    startActivity(new Intent(this, Show.class));


    }

    private void loadMainCategory(Context context) {
        mainCategoryList = new ArrayList<>();
        mainCategoryList.add(new CategoryNameModel("Electronics"));
        mainCategoryList.add(new CategoryNameModel("Home Appliances"));
        mainCategoryList.add(new CategoryNameModel("Furniture"));
        mainCategoryList.add(new CategoryNameModel("Home, Kitchen"));
        mainCategoryList.add(new CategoryNameModel("Books"));
        mainCategoryList.add(new CategoryNameModel("Fashions"));
        mainCategoryList.add(new CategoryNameModel("Electronics"));
        mainCategoryList.add(new CategoryNameModel("Home Appliances"));
        mainCategoryList.add(new CategoryNameModel("Furniture"));
        mainCategoryList.add(new CategoryNameModel("Home, Kitchen"));
        mainCategoryList.add(new CategoryNameModel("Books"));
        mainCategoryList.add(new CategoryNameModel("Fashions"));
        mainCategoryList.add(new CategoryNameModel("Electronics"));
        mainCategoryList.add(new CategoryNameModel("Home Appliances"));
        mainCategoryList.add(new CategoryNameModel("Furniture"));
        mainCategoryList.add(new CategoryNameModel("Home, Kitchen"));
        mainCategoryList.add(new CategoryNameModel("Books"));
        mainCategoryList.add(new CategoryNameModel("Fashions"));
        mainCategoryList.add(new CategoryNameModel("Electronics"));
        mainCategoryList.add(new CategoryNameModel("Home Appliances"));
        mainCategoryList.add(new CategoryNameModel("Furniture"));
        mainCategoryList.add(new CategoryNameModel("Home, Kitchen"));
        mainCategoryList.add(new CategoryNameModel("Books"));
        mainCategoryList.add(new CategoryNameModel("Fashions"));
        mainCategoryList.add(new CategoryNameModel("Electronics"));
        mainCategoryList.add(new CategoryNameModel("Home Appliances"));
        mainCategoryList.add(new CategoryNameModel("Furniture"));
        mainCategoryList.add(new CategoryNameModel("Home, Kitchen"));
        mainCategoryList.add(new CategoryNameModel("Books"));
        mainCategoryList.add(new CategoryNameModel("Fashions"));
        mainCategoryList.add(new CategoryNameModel("Electronics"));
        mainCategoryList.add(new CategoryNameModel("Home Appliances"));
        mainCategoryList.add(new CategoryNameModel("Furniture"));
        mainCategoryList.add(new CategoryNameModel("Home, Kitchen"));
        mainCategoryList.add(new CategoryNameModel("Books"));
        mainCategoryList.add(new CategoryNameModel("Fashions"));
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        categoryNameRecycler.setLayoutManager(layoutManager);

        MainCategoryAdapter userDashboardAdapter = new MainCategoryAdapter(context, mainCategoryList);
        categoryNameRecycler.setAdapter(userDashboardAdapter);

        new ViewCategory(this);

        new SigninSignUp(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_without_signin, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id) {

            case R.id.account:
                startActivity(new Intent(this, MyAccount.class));
                break;

            case R.id.signIn:
                new SigninSignUp(this);
                break;

            case R.id.cart:
                startActivity(new Intent(this, Cart.class));
                break;
        }

        return super.onOptionsItemSelected(item);
    }

/*
    @Override
    public boolean onSupportNavigateUp() {
   NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
*/


}