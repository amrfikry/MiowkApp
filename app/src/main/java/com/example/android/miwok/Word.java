package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation ;

    private String mMiwokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private  int mAudioResourceId ;

    public Word(String defaultTranslation , String miwokTranslation , int AudioResourceId ){

        mDefaultTranslation = defaultTranslation;

        mMiwokTranslation = miwokTranslation ;

        mAudioResourceId = AudioResourceId ;

    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public  int getImageResourceId(){ return  mImageResourceId; }

    public  int getAudioResourceId(){return mAudioResourceId;}

    public Word(String defaultTranslation , String miwokTranslation , int imageResourceId , int AudioResourceId ){

        mDefaultTranslation = defaultTranslation;

        mMiwokTranslation = miwokTranslation ;

        mImageResourceId= imageResourceId;

        mAudioResourceId = AudioResourceId ;

    }
    public boolean hasImage(){

        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}

