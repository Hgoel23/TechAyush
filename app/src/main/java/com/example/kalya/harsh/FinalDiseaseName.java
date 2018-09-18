package com.example.kalya.harsh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FinalDiseaseName extends AppCompatActivity {
    TextView txt;
    private DatabaseReference mDatabaseRef;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_disease_name);
        txt = (TextView)findViewById(R.id.sampleText);
        btn = (Button)findViewById(R.id.contactdoctor);
        mDatabaseRef = FirebaseDatabase.getInstance().getReference();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FinalDiseaseName.this,ImagesActivity.class);

                i.putExtra("name","Doctors");
                startActivity(i);
                Toast.makeText(FinalDiseaseName.this,mDatabaseRef.toString(),Toast.LENGTH_LONG).show();
            }
        });
        String disease = getIntent().getStringExtra("DName").toString();
        Toast.makeText(this,disease,Toast.LENGTH_LONG).show();
        if (disease.equals("abdominaltenderness"))
        {
            txt.setText("Appendicitis, Peritonitis, Salmonella Food Poisoning, Hepatitis, Alcohol-Related Liver Disease, Toxic Megacolon, Pelvic Inflammatory Disease (PID)," +
                    "Urethritis, Hernia, Amebiasis");
        }
        if (disease.equals("acne"))
        {
            txt.setText("Rosacea, PMS (Premenstrual Syndrome), cushing Syndrome, Hyperhidrosis Disorder, Adrenal Cortical Carcinoma, Polycystic Ovary Syndrome ");
        }
        if (disease.equals("armpain"))
        {
            txt.setText("Arthritis,Rotator Cuff Tear,Carpal Tunnel Syndrome, Radiculopathy (Pinched Nerve),Whiplash,Dislocations");
        }
        if (disease.equals("backache"))
        {
            txt.setText("vertebrae");
        }
        if (disease.equals("blackhead"))
        {
            txt.setText("blackhead");
        }
        if (disease.equals("bleeds"))
        {
            txt.setText("unexplained and easy bruising,heavy menstrual bleeding,frequent nosebleeds,bleeding into joints");
        }
        if (disease.equals("bonetenderness"))
        {
            txt.setText("Osteoporosis,Bone Tumors,leukemia,rickets,Hyperparathyroidism");
        }
        if (disease.equals("burningsensation"))
        {
            txt.setText("Herpes simplex, Rosacea, Peripheral vascular disease ,Peripheral neuropathy, Gastroespohageal reflux disease (GERD)");
        }
        if (disease.equals("cataract"))
        {
            txt.setText("high blood pressure, previous eye injuries, diabetes, obesity");
        }
        if (disease.equals("chills"))
        {
            txt.setText("Cold and Flu,Common Cold,Tonsillitis,Strep Throat,Malaria,Sepsis,Septicemia");
        }
        if (disease.equals("colorvisiondeficiency"))
        {
            txt.setText("Macular Degeneration,Optic Neuritis,Sarcoidosis,Glaucoma,Diabetic Retinopathy");
        }
        if (disease.equals("coughing"))
        {
            txt.setText("Asthma, Allergic Rhinitis,Tuberculosis,Cold and Flu,Sinus Infections (Sinusitis)");
        }
        if (disease.equals("dementia"))
        {
            txt.setText("Alzheimer’s disease,vascular dementia,Parkinson’s disease,chronic alcoholism");
        }
        if (disease.equals("depression"))
        {
           txt.setText("arthritis,asthma,cardiovascular disease,cancer,diabetes,obesity");
        }
        if (disease.equals("dermatitis") )
        {
           txt.setText("Allergic Eczema,Kwashiorkor,Thrombophlebitis,Candida Fungus Skin Infection");
        }
        if (disease.equals("drooling"))
        {
           txt.setText("Diphtheria,Rabies,Epiglottitis");
        }
        if (disease.equals("drugabuse"))
        {
            txt.setText("cancer,blood pressure");
        }
        if (disease.equals("fertilityproblem"))
        {
            txt.setText("Teething Syndrome,Diphtheria,Rabies,Epiglottitis,Peritonsillar Abscess,Polio");
        }
        if (disease.equals("hearingloss"))
        {
            txt.setText("Sudden Sensorineural Hearing Loss (SSHL),Eardrum Rupture,Otitis Media with Effusion");
        }
        if (disease.equals("nasaldrainage"))
        {
            txt.setText("pregnancy,chickenpox,deviated septum,drug addiction");
        }
        if (disease.equals("photophobia"))
        {
            txt.setText("Eye Emergencies,Uveitis,Abrasion,Typhus");
        }
        if (disease.equals("podaligia"))
        {
            txt.setText("Eye Emergencies,Corneal Abrasion,Uveitis,Hyphema,Typhus");
        }
        if (disease.equals("poormemory"))
        {
            txt.setText("Alzheimer’s Disease,Delirium,Hypoglycemia,Central Sleep Apnea");
        }
        if (disease.equals("pretermlabour"))
        {
            txt.setText("infection,multiple gestation,problems with the cervix");
        }
        if (disease.equals("puncturewounds"))
        {
            txt.setText("Snake Bites,Animal Bite,Human Bites,Stings");
        }
        if (disease.equals("rectalhemorrhage"))
        {
            txt.setText("Anal Fissure,Ulcerative Colitis,Anal Cancer,Colitis");
        }
        if (disease.equals("rectalitching"))
        {
            txt.setText("Pinworm Infection,Hemorrhoids,Genital Warts,Hookworm Infections");
        }
        if (disease.equals("redeyes"))
        {
            txt.setText("Conjunctivitis,Scleritis,Uveitis,Hordeolum Externum");
        }
        if (disease.equals("respiratoryobstruction"))
        {
            txt.setText("Diphtheria,Laryngitis,Epiglottitis,Peritonsillar Abscess");
        }
        if (disease.equals("sciatica"))
        {
            txt.setText("Slipped (Herniated),Spondylolisthesis,Radiculopathy (Pinched Nerve)");
        }
        if (disease.equals("seizures"))
        {
            txt.setText("Epilepsy,Eclampsia,Cerebral Palsy,Brain Hypoxia, (Hyponatremia)");
        }
        if (disease.equals("vomting"))
        {
            txt.setText("Food Poisoning,Indigestion,Viral Gastroenteritis (Stomach Flu)");
        }
        if (disease.equals("waspsting"))
        {
            txt.setText("dizziness,diarrhea,stomach cramps,gasping");
        }
        if (disease.equals("weakbladder"))
        {
            txt.setText("Stress Incontinence,Epilepsy,Urethral Stricture,Urethritis");
        }
        if (disease.equals("webbedfeet"))
        {
            txt.setText("Tabbed: Acromegaly-HideMobileLB,Ito Syndrome (Incontinentia Pigementi Achromians)");
        }
        if (disease.equals("weightloss"))
        {
            txt.setText("Malnutrition, Liver Cancer,Esophageal Cancer,Cirrhosis");
        }
        if (disease.equals("wheezing"))
        {
            txt.setText("Asthma,Emphysema,Anaphylaxis,Congestive Heart Failure (CHF)");
        }
        if (disease.equals("wristpain"))
        {
            txt.setText("Sprains and Strains,Arthritis,Dislocations,Fracture");
        }
        if (disease.equals("xerostomial"))
        {
            txt.setText("Dehydration,Hyperventilation,Anemia,Cholera,Sarcoidosis");
        }
        if (disease.equals("yawnstoomuch"))
        {
            txt.setText("Drowsiness,Insomnia");
        }
        if (disease.equals("yelloeyes"))
        {
            txt.setText("Hepatitis,Biliary Duct Obstruction");
        }
    }
}
