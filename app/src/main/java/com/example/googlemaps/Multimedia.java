package com.example.googlemaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Multimedia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multimedia);

        VideoView Mivideo = findViewById(R.id.videoView);
        // se crea una cadena que representa la ubicacion del recurso
        String video = "android.resource://"+getPackageName()+"/"+R.raw.santotomas;
        Uri uri = Uri.parse(video); // se crea objeto uri a partir de la cadena
        Mivideo.setVideoURI(uri); // se establece la fuente del video

        // se crea un objeto que proporciona los controles de reproduccion.

        MediaController mediaController = new MediaController(this);
        Mivideo.setMediaController(mediaController); // se asigna los contorles de reporoduccion sean visibles y funcionales
        mediaController.setAnchorView(Mivideo); // se especifica la vista a la que se anclaran los controles
    }

    public void MainActivity(View v){
        Intent horizontal = new Intent(this, MainActivity.class);
        startActivity(horizontal);
    }
}