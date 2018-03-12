package ko.alex.materialdesignpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) { // adds popup menu to toolbar
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.item1_id){
            Toast.makeText(this,"Item 1 selected",Toast.LENGTH_SHORT).show();
        } else if(id==R.id.item2_id){
            Toast.makeText(this,"Item 2 selected",Toast.LENGTH_SHORT).show();
        } else if(id==R.id.item3_id){
            Toast.makeText(this,"Item 3 selected",Toast.LENGTH_SHORT).show();
        } else if(id==R.id.biohazard){
            Toast.makeText(this,"Biohazard selected",Toast.LENGTH_SHORT).show();
        } else if(id==R.id.qrcodescan){
            Toast.makeText(this,"QR code scan selected",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }





}
