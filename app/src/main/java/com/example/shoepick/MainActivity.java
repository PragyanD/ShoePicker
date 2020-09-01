package com.example.shoefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    ShoeModel[] shoeModel= new ShoeModel[20];
    int counter = 0;
    int shoeCounter =0;
    int x;
    int y = 0;
    int left= 0;
    boolean customize = false;
    int customWeight = 0;
    int[][] images = {{R.drawable.zoomx1, R.drawable.zoomx2},
            {R.drawable.pegasus1, R.drawable.pegasus2},
            {R.drawable.gelkayano1, R.drawable.gelkayano2},
            {R.drawable.gelcumulus1, R.drawable.gelcumulus2},
            {R.drawable.ultraboost1, R.drawable.ultraboost2},
            {R.drawable.predator1, R.drawable.predator2},
            {R.drawable.copamundial1, R.drawable.copamundial2},
            {R.drawable.tiempo1, R.drawable.tiempo2},
            {R.drawable.universal1, R.drawable.universal2},
            {R.drawable.mercurial1, R.drawable.mercurial2},
            {R.drawable.court1, R.drawable.court2},
            {R.drawable.barricade1, R.drawable.barricade2},
            {R.drawable.solecourt1, R.drawable.solecourt2},
            {R.drawable.challenger1, R.drawable.challenger2},
            {R.drawable.courtlite1, R.drawable.courtlite2}};

    TextView name = (TextView) findViewById(R.id.name);
    TextView use = (TextView) findViewById(R.id.use);
    TextView durability = (TextView) findViewById(R.id.durability);
    TextView sport = (TextView) findViewById(R.id.sport);
    TextView material = (TextView) findViewById(R.id.material);
    TextView ftype = (TextView) findViewById(R.id.ftype);
    TextView cost = (TextView) findViewById(R.id.cost);
    TextView score = (TextView) findViewById(R.id.score);
    Button btnLeft = (Button) findViewById(R.id.btnLeft);
    Button btnRight = (Button) findViewById(R.id.btnRight);
    ImageView imageView = (ImageView) findViewById(R.id.image);

    SeekBar custom;
    SeekBar udurability;
    SeekBar type;
    SeekBar usport;
    SeekBar uuse;
    SeekBar umaterial;
    final TextView weightLeft = (TextView)findViewById(R.id.weight);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonHelp();
        seekHelp();
        customWeight= getCustomWeight();
        if(customWeight == 1)
            customize = true;
        else
            customize = false;
        if(shoeModel!= null)
        display(shoeModel);
        else {
            imageView.setImageResource(R.drawable.shoefinder);
            score.setText("Please Wait");
        }

    }

    // seekbar listeners
    public void seekHelp(){

        custom = (SeekBar) findViewById(R.id.custom);
        custom.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seek, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

        udurability = (SeekBar) findViewById(R.id.udurability);
        udurability.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seek, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                left = 100 - (progress + umaterial.getProgress() + type.getProgress() +
                        usport.getProgress() + uuse.getProgress());
                weightLeft.setText(left);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

        type = (SeekBar) findViewById(R.id.uft);
        type.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seek, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                left = 100 - (progress + umaterial.getProgress() + udurability.getProgress() +
                        usport.getProgress() + uuse.getProgress());
                weightLeft.setText(left);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

        usport = (SeekBar) findViewById(R.id.usport);
        usport.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seek, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                left = 100 - (progress + umaterial.getProgress() + type.getProgress() +
                        udurability.getProgress() + uuse.getProgress());
                weightLeft.setText(left);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });
        uuse = (SeekBar) findViewById(R.id.uuse);
        uuse.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seek, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                left = 100 - (progress + umaterial.getProgress() + type.getProgress() +
                        usport.getProgress() + udurability.getProgress());
                weightLeft.setText(left);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });
        umaterial = (SeekBar) findViewById(R.id.umaterial);
        umaterial.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seek, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                left = 100 - (progress + udurability.getProgress() + type.getProgress() +
                        usport.getProgress() + uuse.getProgress());
                weightLeft.setText(left);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });
    }

    //button listeners
    public void buttonHelp(){
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                x--;
                display(shoeModel);
            }
        });
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                x++;
                display(shoeModel);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                y++;
                y %= 2;
                if (y == 50)
                    y = 0;
                imageView.setImageResource(images[x][y]);
            }
        });
    }

    //display
    public void display(ShoeModel[] shoeModel){

        counter %= shoeModel.length;
        x = shoeModel[counter].getId();

        name.setText(shoeModel[counter].getName());
        cost.setText(shoeModel[counter].getPrice());
        ftype.setText(shoeModel[counter].getType());
        durability.setText(shoeModel[counter].getDurability());
        material.setText(shoeModel[counter].getMaterial());
        sport.setText(shoeModel[counter].getSport());
        use.setText(shoeModel[counter].getUse());
        score.setText(Double.toString(shoeModel[counter].getRating()));
        imageView.setImageResource(images[x][y]);
    }


    public int getCustomWeight() {
        int customWeight = custom.getProgress();
        return customWeight;
    }

    public double getDurability() {
        double dweight = udurability.getProgress();
        return dweight;
    }

    public double getFtype() {
        double fweight = type.getProgress();
        return fweight;
    }

    public double getSport() {
        double sweight = usport.getProgress();
        return sweight;
    }

    public double getUse() {
        double uweight = uuse.getProgress();
        return uweight;
    }

    public double getMaterial() {
        double mweight = umaterial.getProgress();
        return mweight;
    }

}