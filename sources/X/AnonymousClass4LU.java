package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.registration.VerifyPhoneNumber;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.4LU  reason: invalid class name */
public class AnonymousClass4LU extends BroadcastReceiver {
    public final C620633i A00;
    public final AnonymousClass5ZR A01;
    public final AnonymousClass33p A02;
    public final C56912sl A03;
    public final C97684z4 A04;
    public final AnonymousClass4FS A05;
    public final Object A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final WeakReference A0A;
    public volatile boolean A0B;

    public void onReceive(Context context, Intent intent) {
        boolean z;
        if (!this.A0B) {
            synchronized (this.A06) {
                if (!this.A0B) {
                    AnonymousClass2A1.A01(context);
                    this.A0B = true;
                }
            }
        }
        Log.i("FlashCallReceiver/onReceive");
        Intent intent2 = intent;
        if (TelephonyManager.EXTRA_STATE_RINGING.equals(intent2.getStringExtra("state")) && intent2.hasExtra("incoming_number")) {
            String stringExtra = intent2.getStringExtra("incoming_number");
            C184588sB r12 = (C184588sB) this.A0A.get();
            if (r12 != null) {
                if (TextUtils.isEmpty(stringExtra)) {
                    Log.i("FlashCallReceiver/incomingCallPhoneNumber empty");
                    this.A04.A02 = true;
                } else {
                    String replaceAll = stringExtra.replaceAll("\\D", "");
                    String str = this.A07;
                    Matcher matcher = Pattern.compile(str).matcher(replaceAll);
                    String replaceAll2 = str.replaceAll("\\D", "");
                    int length = replaceAll.length();
                    int i = length - 7;
                    int lastIndexOf = replaceAll.lastIndexOf(replaceAll2, i - 1);
                    if (!matcher.matches() || length < replaceAll2.length() + 7 || lastIndexOf == -1 || !replaceAll.substring(lastIndexOf, i).equals(replaceAll2)) {
                        Log.i("FlashCallReceiver/incoming phone number does not match CLI");
                        this.A04.A01 = true;
                    } else {
                        Log.i("FlashCallReceiver/incoming phone number matches CLI");
                        VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) r12;
                        verifyPhoneNumber.A1P = true;
                        verifyPhoneNumber.A7J();
                        if (verifyPhoneNumber.A8D()) {
                            verifyPhoneNumber.A7C();
                            verifyPhoneNumber.A13.A00();
                            Log.i("VerifyPhoneNumber/receive-primary-flash-call/valid-phone-number");
                            verifyPhoneNumber.A7Y(R.string.f11nameremoved);
                        } else {
                            Log.i("VerifyPhoneNumber/receive-secondary-flash-call");
                        }
                        Log.i("FlashCallReceiver/sending code for verification");
                        C97684z4 r11 = this.A04;
                        if (!this.A01.A0B()) {
                            Log.i("FlashCallReceiver/Cannot end call");
                        } else {
                            int i2 = Build.VERSION.SDK_INT;
                            C620633i r0 = this.A00;
                            if (i2 >= 28) {
                                TelecomManager A0L = r0.A0L();
                                if (A0L != null) {
                                    A0L.endCall();
                                    Log.i("FlashCallReceiver/End call successful");
                                }
                            } else {
                                TelephonyManager A0N = r0.A0N();
                                if (A0N != null) {
                                    try {
                                        Method declaredMethod = A0N.getClass().getDeclaredMethod("getITelephony", new Class[0]);
                                        declaredMethod.setAccessible(true);
                                        Object invoke = declaredMethod.invoke(A0N, new Object[0]);
                                        invoke.getClass().getDeclaredMethod("endCall", new Class[0]).invoke(invoke, new Object[0]);
                                        Log.i("FlashCallReceiver/End call successful");
                                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                                        Log.i("FlashCallReceiver/Cannot end call", e);
                                    }
                                }
                            }
                            z = true;
                            r11.A00 = Boolean.valueOf(z);
                            AnonymousClass4FS r4 = this.A05;
                            String str2 = this.A08;
                            String str3 = this.A09;
                            C626936e.A06(str3);
                            r4.BkL(new C992555a(this.A02, this.A03, (C153017aX) null, r11, r12, str2, str3, "flash", (String) null, (String) null, 2, false), replaceAll);
                            return;
                        }
                        z = false;
                        r11.A00 = Boolean.valueOf(z);
                        AnonymousClass4FS r42 = this.A05;
                        String str22 = this.A08;
                        String str32 = this.A09;
                        C626936e.A06(str32);
                        r42.BkL(new C992555a(this.A02, this.A03, (C153017aX) null, r11, r12, str22, str32, "flash", (String) null, (String) null, 2, false), replaceAll);
                        return;
                    }
                }
                VerifyPhoneNumber verifyPhoneNumber2 = (VerifyPhoneNumber) r12;
                verifyPhoneNumber2.A1P = false;
                verifyPhoneNumber2.A7J();
                if (verifyPhoneNumber2.A8D()) {
                    verifyPhoneNumber2.A7C();
                    verifyPhoneNumber2.A13.A00();
                    Log.i("VerifyPhoneNumber/receive-primary-flash-call/invalid-phone-number");
                    verifyPhoneNumber2.A7c(verifyPhoneNumber2.A10.A00("sms"), verifyPhoneNumber2.A10.A00("voice"));
                    return;
                }
                Log.i("VerifyPhoneNumber/receive-secondary-flash-call");
            }
        }
    }

    public AnonymousClass4LU(C620633i r2, AnonymousClass5ZR r3, AnonymousClass33p r4, C56912sl r5, C97684z4 r6, C184588sB r7, AnonymousClass4FS r8, String str, String str2, String str3) {
        this();
        this.A07 = str;
        this.A05 = r8;
        this.A08 = str2;
        this.A09 = str3;
        this.A04 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A0A = AnonymousClass0x9.A14(r7);
    }

    public AnonymousClass4LU() {
        this.A0B = false;
        this.A06 = AnonymousClass002.A0D();
    }
}
