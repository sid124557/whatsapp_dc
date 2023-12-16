package com.google.firebase.provider;

import X.AnonymousClass001;
import X.C161757qO;
import X.C162177rO;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

public class FirebaseInitProvider extends ContentProvider {
    public static final String EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY = "com.google.firebase.firebaseinitprovider";
    public static final String TAG = "FirebaseInitProvider";

    public static void checkContentProviderAuthority(ProviderInfo providerInfo) {
        C162177rO.A03(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if (EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY.equals(providerInfo.authority)) {
            throw AnonymousClass001.A0e("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    public String getType(Uri uri) {
        return null;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        checkContentProviderAuthority(providerInfo);
        super.attachInfo(context, providerInfo);
    }

    public boolean onCreate() {
        String str;
        if (C161757qO.A01(getContext()) == null) {
            str = "FirebaseApp initialization unsuccessful";
        } else {
            str = "FirebaseApp initialization successful";
        }
        Log.i(TAG, str);
        return false;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }
}
