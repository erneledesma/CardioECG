package design.material.com.cardioecg2;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import design.material.com.cardioecg2.fragments.PacientesFragment;
import design.material.com.cardioecg2.fragments.ProfileFragment;
import design.material.com.cardioecg2.fragments.SeguimientoFragment;

public class CardioRegistro extends Activity  implements ActionBar.TabListener{

    private Fragment[] fragments  = new Fragment[]{

            new PacientesFragment("Hola"),
            new SeguimientoFragment(),
            new ProfileFragment()

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cardio_two);

        setTabs();

        FragmentManager manager = getFragmentManager();
       FragmentTransaction fragmentTransaction = manager.beginTransaction();

        for (Fragment fragment : fragments){

            fragmentTransaction.add(R.id.main_cardio, fragment).hide(fragment);

        }

        fragmentTransaction.show(fragments[0]).commit();




    }


    private void setTabs(){

        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        actionBar.addTab(actionBar.newTab().setText("Paciente").setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("Registro").setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("Perfil").setTabListener(this));

    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        for (Fragment fragment : fragments){
            fragmentTransaction.hide(fragment);

        }

        fragmentTransaction.show(fragments[tab.getPosition()]);


    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
