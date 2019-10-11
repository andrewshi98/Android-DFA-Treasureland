package com.example.dataflowexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.DownloadManager;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    private class EvilDoer {
        public EvilDoer() {}

        public int DoEvil() {
            new DownloadManager.Request(Uri.parse("http://speedtest.ftp.otenet.gr/files/test10Mb.db"));
        }
    }

    private EvilDoer getEvil() {
        return new EvilDoer();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int nice = getEvil().DoEvil();
    }
}
