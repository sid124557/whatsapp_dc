package com.google.android.gms.common.api;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass6Q8;
import X.AnonymousClass6UF;
import X.C127866Tp;
import X.C163007t7;
import X.C86614Ku;
import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public int A00 = 0;

    public final void onCancel(DialogInterface dialogInterface) {
        this.A00 = 0;
        setResult(0);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (bundle != null) {
            this.A00 = bundle.getInt("resolution");
        }
        if (this.A00 != 1) {
            Bundle A0D = C86614Ku.A0D(this);
            if (A0D == null) {
                str = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) A0D.get("pending_intent");
                Object obj = A0D.get("error_code");
                if (pendingIntent != null) {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                        this.A00 = 1;
                        return;
                    } catch (ActivityNotFoundException e) {
                        if (A0D.getBoolean("notify_manager", true)) {
                            C163007t7.A01(this).A05(new C127866Tp(22, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                        } else {
                            String obj2 = pendingIntent.toString();
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("Activity not found while launching ");
                            A0o.append(obj2);
                            String A0X = AnonymousClass000.A0X(".", A0o);
                            if (Build.FINGERPRINT.contains("generic")) {
                                A0X = A0X.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            Log.e("GoogleApiActivity", A0X, e);
                        }
                        this.A00 = 1;
                    } catch (IntentSender.SendIntentException e2) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e2);
                        finish();
                        return;
                    }
                } else if (obj != null) {
                    int A0K = AnonymousClass001.A0K(obj);
                    Dialog A002 = AnonymousClass6Q8.A00(this, this, new AnonymousClass6UF(this, AnonymousClass6Q8.A00.A05(this, "d", A0K), 2), A0K);
                    if (A002 != null) {
                        AnonymousClass6Q8.A02(this, A002, this, "GooglePlayServicesErrorDialog");
                    }
                    this.A00 = 1;
                    return;
                } else {
                    str = "Activity started without resolution";
                }
            }
            Log.e("GoogleApiActivity", str);
            finish();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.A00);
        super.onSaveInstanceState(bundle);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.A00 = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C163007t7 A01 = C163007t7.A01(this);
                if (i2 == -1) {
                    Handler handler = A01.A06;
                    handler.sendMessage(handler.obtainMessage(3));
                } else if (i2 == 0) {
                    A01.A05(new C127866Tp(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.A00 = 0;
            setResult(i2, intent);
        }
        finish();
    }
}
