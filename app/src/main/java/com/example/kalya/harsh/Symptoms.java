package com.example.kalya.harsh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Symptoms extends AppCompatActivity implements View.OnClickListener{
    ImageView abdominaltenderness,acne,armpain,backache,blackhead,bleeds
            ,bonetenderness,burningsensation,cataract,chestpain,chills,
    colorvisiondeficiency,coughing,drugabuse,dementia,depression,dermatitis,drooling,
    fertilityproblem,hearingloss,nasaldrainage,photophobia,podaligia,poormemory,pretermlabour,puncturewounds,rectalhemorrhage,
    rectalitching,redeyes,respiratoryobstruction,sciatica,seizures,vomting,waspsting,
    weakbladder,webbedfeet,weightloss,wheezing,wristpain,xerostomial,yawnstoomuch,yelloeyes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);
        abdominaltenderness = (ImageView)findViewById(R.id.abdominaltendernes);
        acne= (ImageView)findViewById(R.id.acne);
        armpain= (ImageView)findViewById(R.id.armpain);
        backache= (ImageView)findViewById(R.id.backache);
        blackhead= (ImageView)findViewById(R.id.blackhead);
        bleeds= (ImageView)findViewById(R.id.bleeds);
        bonetenderness= (ImageView)findViewById(R.id.bonetenderness);
        burningsensation= (ImageView)findViewById(R.id.burningsensation);
        cataract= (ImageView)findViewById(R.id.cataract);
        chestpain= (ImageView)findViewById(R.id.chestpain);
        chills= (ImageView)findViewById(R.id.chills);
        colorvisiondeficiency= (ImageView)findViewById(R.id.colorvisiondeficiency);
        coughing= (ImageView)findViewById(R.id.coughing);
        drooling =(ImageView)findViewById(R.id.drooling);
        drugabuse = (ImageView)findViewById(R.id.drugabuse);
        dementia= (ImageView)findViewById(R.id.dementia);
        depression= (ImageView)findViewById(R.id.depression);
        dermatitis= (ImageView)findViewById(R.id.dermatitis);
        fertilityproblem= (ImageView)findViewById(R.id.fertilityproblem);
        hearingloss= (ImageView)findViewById(R.id.hearingloss);
        nasaldrainage= (ImageView)findViewById(R.id.nasaldrainage);
        photophobia= (ImageView)findViewById(R.id.photophobia);
        podaligia= (ImageView)findViewById(R.id.podalgia);
        poormemory= (ImageView)findViewById(R.id.poormemory);
        pretermlabour= (ImageView)findViewById(R.id.pretermlabor);
        puncturewounds= (ImageView)findViewById(R.id.puncturewound);
        rectalhemorrhage= (ImageView)findViewById(R.id.rectalitching);
        rectalitching= (ImageView)findViewById(R.id.rectalitching);
        redeyes= (ImageView)findViewById(R.id.redeyes);
        respiratoryobstruction= (ImageView)findViewById(R.id.respiratoryobstruction);
        sciatica= (ImageView)findViewById(R.id.sciatica);
        seizures= (ImageView)findViewById(R.id.seizures);
        vomting= (ImageView)findViewById(R.id.vomting);
        waspsting= (ImageView)findViewById(R.id.waspsting);
        weakbladder= (ImageView)findViewById(R.id.weakbladder);
        webbedfeet= (ImageView)findViewById(R.id.webbedfeet);
        weightloss= (ImageView)findViewById(R.id.weightloss);
        wheezing= (ImageView)findViewById(R.id.wheezing);
        wristpain= (ImageView)findViewById(R.id.wristpain);
        xerostomial= (ImageView)findViewById(R.id.xerostomial);
        yawnstoomuch= (ImageView)findViewById(R.id.yawnstoomuch);
        yelloeyes= (ImageView)findViewById(R.id.yelloweyes);
        abdominaltenderness.setOnClickListener(this);
        acne.setOnClickListener(this);
        armpain.setOnClickListener(this);
        backache.setOnClickListener(this);
        blackhead.setOnClickListener(this);
        bleeds.setOnClickListener(this);
        bonetenderness.setOnClickListener(this);
        burningsensation.setOnClickListener(this);
        cataract.setOnClickListener(this);
        chestpain.setOnClickListener(this);
        chills.setOnClickListener(this);
        colorvisiondeficiency.setOnClickListener(this);
        coughing.setOnClickListener(this);
        dementia.setOnClickListener(this);
        depression.setOnClickListener(this);
        dermatitis.setOnClickListener(this);
        drooling.setOnClickListener(this);
        drugabuse.setOnClickListener(this);
        fertilityproblem.setOnClickListener(this);
        hearingloss.setOnClickListener(this);
        nasaldrainage.setOnClickListener(this);
        photophobia.setOnClickListener(this);
        podaligia.setOnClickListener(this);
        poormemory.setOnClickListener(this);
        pretermlabour.setOnClickListener(this);
        puncturewounds.setOnClickListener(this);
        rectalhemorrhage.setOnClickListener(this);
        rectalitching.setOnClickListener(this);
        redeyes.setOnClickListener(this);
        respiratoryobstruction.setOnClickListener(this);
        sciatica.setOnClickListener(this);
        seizures.setOnClickListener(this);
        vomting.setOnClickListener(this);
        waspsting.setOnClickListener(this);
        weakbladder.setOnClickListener(this);
        webbedfeet.setOnClickListener(this);
        weightloss.setOnClickListener(this);
        wheezing.setOnClickListener(this);
        wristpain.setOnClickListener(this);
        xerostomial.setOnClickListener(this);
        yawnstoomuch.setOnClickListener(this);
        yelloeyes.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == abdominaltenderness)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","abdominaltenderness");
            startActivity(i);
        }
        if (v == acne)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","acne");
            startActivity(i);
        }
        if (v == armpain)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","armpain");
            startActivity(i);
        }
        if (v == backache)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","backache");
            startActivity(i);
        }
        if (v == blackhead)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","blackhead");
            startActivity(i);
        }
        if (v == bleeds)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","bleeds");
            startActivity(i);
        }
        if (v == bonetenderness)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","bonetenderness");
            startActivity(i);
        }
        if (v == burningsensation)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","burningsensation");
            startActivity(i);
        }
        if (v == cataract)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","cataract");
            startActivity(i);
        }
        if (v == chills)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","chills");
            startActivity(i);
        }
        if (v == colorvisiondeficiency)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","colorvisiondeficiency");
            startActivity(i);
        }
        if (v == coughing)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","coughing");
            startActivity(i);
        }
        if (v == dementia)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","dementia");
            startActivity(i);
        }
        if (v == depression)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","depression");
            startActivity(i);
        }
        if (v == dermatitis)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","dermatitis");
            startActivity(i);
        }
        if (v == drooling)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","drooling");
            startActivity(i);
        }
        if (v == drugabuse)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","drugabuse");
            startActivity(i);
        }
        if (v == fertilityproblem)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","fertilityproblem");
            startActivity(i);
        }
        if (v == hearingloss)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","hearingloss");
            startActivity(i);
        }
        if (v == nasaldrainage)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","nasaldrainage");
            startActivity(i);
        }
        if (v == photophobia)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","photophobia");
            startActivity(i);
        }
        if (v == podaligia)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","podaligia");
            startActivity(i);
        }
        if (v == poormemory)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","poormemory");
            startActivity(i);
        }
        if (v == pretermlabour)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","pretermlabour");
            startActivity(i);
        }
        if (v == puncturewounds)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","puncturewounds");
            startActivity(i);
        }
        if (v == rectalhemorrhage)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","rectalhemorrhage");
            startActivity(i);
        }
        if (v == rectalitching)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","rectalitching");
            startActivity(i);
        }
        if (v == redeyes)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","redeyes");
            startActivity(i);
        }
        if (v == respiratoryobstruction)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","respiratoryobstruction");
            startActivity(i);
        }
        if (v == sciatica)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","sciatica");
            startActivity(i);
        }
        if (v == seizures)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","seizures");
            startActivity(i);
        }
        if (v == vomting)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","vomting");
            startActivity(i);
        }
        if (v == waspsting)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","waspsting");
            startActivity(i);
        }
        if (v == weakbladder)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","weakbladder");
            startActivity(i);
        }
        if (v == webbedfeet)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","webbedfeet");
            startActivity(i);
        }
        if (v == weightloss)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","weightloss");
            startActivity(i);
        }
        if (v == wheezing)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","wheezing");
            startActivity(i);
        }
        if (v == wristpain)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","wristpain");
            startActivity(i);
        }
        if (v == xerostomial)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","xerostomial");
            startActivity(i);
        }
        if (v == yawnstoomuch)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","yawnstoomuch");
            startActivity(i);
        }
        if (v == yelloeyes)
        {
            Intent i = new Intent(this,FinalDiseaseName.class);
            i.putExtra("DName","yelloeyes");
            startActivity(i);
        }
    }
}
