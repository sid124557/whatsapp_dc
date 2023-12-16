package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.whatsapp.R;
import com.whatsapp.registration.VerifyPhoneNumber;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.4LS  reason: invalid class name */
public class AnonymousClass4LS extends BroadcastReceiver {
    public boolean A00;
    public final AnonymousClass33p A01;
    public final Object A02;
    public final WeakReference A03;
    public volatile boolean A04;

    public void onReceive(Context context, Intent intent) {
        SharedPreferences.Editor editor;
        String A0X;
        String str;
        String str2;
        if (!this.A04) {
            synchronized (this.A02) {
                if (!this.A04) {
                    AnonymousClass2A1.A01(context);
                    this.A04 = true;
                }
            }
        }
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Log.i("SMSRetrieverReceiver/onReceive/text/intent");
            if (this.A00) {
                str2 = "SMSRetrieverReceiver/onReceive/already received";
            } else {
                VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) this.A03.get();
                if (verifyPhoneNumber == null) {
                    str2 = "SMSRetrieverReceiver/onReceive/activity is null";
                } else if (verifyPhoneNumber.BHW()) {
                    str2 = "SMSRetrieverReceiver/onReceive/destroyed";
                } else {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        str = "SMSRetrieverReceiver/onReceive/bundle-null";
                    } else {
                        Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                        if (status == null) {
                            str = "SMSRetrieverReceiver/onReceive/status-null";
                        } else {
                            int i = status.A01;
                            if (i == 0) {
                                String string = extras.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                                if (string == null) {
                                    AnonymousClass36l.A0O(this.A01, "null-sms-message");
                                    return;
                                }
                                C18260x0.A0q("SMSRetrieverReceiver/onReceive/success/ message: ", string, AnonymousClass001.A0o());
                                String string2 = verifyPhoneNumber.getString(R.string.f11nameremoved);
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("(?:WhatsApp|");
                                A0o.append(Pattern.quote(string2));
                                Matcher matcher = Pattern.compile(AnonymousClass000.A0X(").*?([0-9]{3})-([0-9]{3})", A0o)).matcher(string);
                                if (!matcher.find()) {
                                    A0X = null;
                                } else {
                                    StringBuilder A0o2 = AnonymousClass001.A0o();
                                    A0o2.append(matcher.group(1));
                                    A0X = AnonymousClass000.A0X(matcher.group(2), A0o2);
                                }
                                if (C615531h.A01(A0X, -1) != -1) {
                                    this.A00 = true;
                                    verifyPhoneNumber.A7y(A0X);
                                } else {
                                    Log.w("SMSRetrieverReceiver/onReceive/no-code");
                                    AnonymousClass36l.A0O(this.A01, "server-send-mismatch-empty");
                                }
                                editor = C18270x1.A03(this.A01).putInt("sms_retriever_retry_count", 0);
                            } else if (i == 15) {
                                Log.d("SMSRetrieverReceiver/onReceive/timeout waiting for text message");
                                AnonymousClass33p r4 = this.A01;
                                int A022 = C18280x3.A02(AnonymousClass0x2.A0F(r4), "sms_retriever_retry_count");
                                if (A022 < 2) {
                                    Log.d("SMSRetrieverReceiver/onReceive/re-registering smsretriever client");
                                    Task A042 = new C127006Qg((Activity) verifyPhoneNumber).A04();
                                    A042.addOnSuccessListener(new C111045hS(this, A022));
                                    A042.addOnFailureListener(new C123886Ad(this, 1));
                                    return;
                                }
                                AnonymousClass36l.A0O(r4, "timeout-waiting-for-sms");
                                editor = C18270x1.A03(r4).putInt("sms_retriever_retry_count", 0);
                            } else {
                                return;
                            }
                            editor.apply();
                            return;
                        }
                    }
                    Log.e(str);
                    return;
                }
            }
            Log.i(str2);
        }
    }

    public AnonymousClass4LS(AnonymousClass33p r2, VerifyPhoneNumber verifyPhoneNumber) {
        this();
        this.A03 = AnonymousClass0x9.A14(verifyPhoneNumber);
        this.A01 = r2;
    }

    public AnonymousClass4LS() {
        this.A04 = false;
        this.A02 = AnonymousClass002.A0D();
    }
}
