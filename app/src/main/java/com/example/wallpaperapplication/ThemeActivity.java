package com.example.wallpaperapplication;

import android.app.WallpaperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.io.IOException;

public class ThemeActivity extends AppCompatActivity {
    LinearLayout theme_preview;
    Button btnBack, btnSet;
    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);
        btnBack = (Button) findViewById(R.id.btn_back);
        btnSet = (Button) findViewById(R.id.btn_save);
        theme_preview = (LinearLayout) findViewById(R.id.themePreview);

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                newString = null;
            } else {
                newString = extras.getString("PATH_PICTURE");
                if (newString.equals("btn1")) {
                    theme_preview.setBackgroundResource(R.drawable.w1);

                    btnSet.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Berhasil Dipasang!", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.w1);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } else if (newString.equals("btn2")) {
                    theme_preview.setBackgroundResource(R.drawable.w2);
                    btnSet.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Berhasil dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.w2);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });

                } else if (newString.equals("btn3")) {
                    theme_preview.setBackgroundResource(R.drawable.w3);
                    btnSet.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Berhasil dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.w3);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }else if (newString.equals("btn4")) {
                    theme_preview.setBackgroundResource(R.drawable.w4);
                    btnSet.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Berhasil dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.w4);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }else if (newString.equals("btn5")) {
                    theme_preview.setBackgroundResource(R.drawable.w5);
                    btnSet.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Berhasil dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.w5);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }else if (newString.equals("btn6")) {
                    theme_preview.setBackgroundResource(R.drawable.w6);
                    btnSet.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Berhasil dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.w6);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }else if (newString.equals("btn7")) {
                    theme_preview.setBackgroundResource(R.drawable.w7);
                    btnSet.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Berhasil dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.w7);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }else if (newString.equals("btn8")) {
                    theme_preview.setBackgroundResource(R.drawable.w8);
                    btnSet.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Berhasil dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.w8);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }else if (newString.equals("btn9")) {
                    theme_preview.setBackgroundResource(R.drawable.w9);
                    btnSet.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Berhasil dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.w9);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }


                    btnBack.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            onBackPressed();
                        }
                    });
                }
            }
        }
    }