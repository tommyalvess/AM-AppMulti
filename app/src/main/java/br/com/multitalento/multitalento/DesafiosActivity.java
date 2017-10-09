package br.com.multitalento.multitalento;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import br.com.multitalento.multitalento.activies.FoodList;


public class DesafiosActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desafios);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Desafios");


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.desafios, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle br.com.multitalento.multitalento.br.com.multitalento.multitalento.br.com.multitalento.multitalento.br.com.multitalento.multitalento.br.com.multitalento.multitalento.navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.perfil) {
            Intent it = new Intent(DesafiosActivity.this, PerfilActivity.class);
            startActivity(it);
        } else if (id == R.id.nav_home) {
            Intent it = new Intent(DesafiosActivity.this, HomeActivity.class);
            startActivity(it);

        } else if (id == R.id.desafios) {
            Intent it = new Intent(DesafiosActivity.this, DesafiosActivity.class);
            startActivity(it);

        } else if (id == R.id.hackatons) {
                    Intent it = new Intent(DesafiosActivity.this, FoodList.class);
            startActivity(it);

        } else if (id == R.id.parceiros) {
            Intent it = new Intent(DesafiosActivity.this, EmpresaActivity.class);
            startActivity(it);

        } else if (id == R.id.ativar) {

        }else if (id == R.id.settigs) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
