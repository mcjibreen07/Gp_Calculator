package SpinnerClass;

import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.alanjiro.gp_calculator.Gpa4;
import com.example.alanjiro.gp_calculator.R;

public class Selectitems {
    int totalUnit;

    public int getTotalUnit(int a, int b, int c, int d, int e, int f, int g) {

        totalUnit = a + b + c + d + e + f + g;
        return totalUnit;


    }


}
