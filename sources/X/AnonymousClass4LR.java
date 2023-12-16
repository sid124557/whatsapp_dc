package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import com.whatsapp.R;
import com.whatsapp.registration.VerifyPhoneNumber;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.4LR  reason: invalid class name */
public class AnonymousClass4LR extends BroadcastReceiver {
    public boolean A00;
    public final AnonymousClass33p A01;
    public final Object A02;
    public final WeakReference A03;
    public volatile boolean A04;

    public void onReceive(Context context, Intent intent) {
        SmsMessage smsMessage;
        String str;
        if (!this.A04) {
            synchronized (this.A02) {
                if (!this.A04) {
                    AnonymousClass2A1.A01(context);
                    this.A04 = true;
                }
            }
        }
        Log.i("receivedtextreceiver/text/intent");
        if (this.A00) {
            str = "receivedtextreceiver/already received";
        } else {
            VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) this.A03.get();
            if (verifyPhoneNumber == null) {
                str = "receivedtextreceiver/activity is null";
            } else if (verifyPhoneNumber.BHW()) {
                str = "receivedtextreceiver/destroyed";
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    str = "receivedtextreceiver/bundle-null";
                } else {
                    Object[] objArr = (Object[]) extras.get("pdus");
                    if (objArr == null) {
                        str = "receivedtextreceiver/pdus-null";
                    } else {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("receivedtextreceiver/pdus-length/");
                        C18260x0.A1G(A0o, r5);
                        String string = verifyPhoneNumber.getString(R.string.f11nameremoved);
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        A0o2.append("(?:WhatsApp|");
                        A0o2.append(Pattern.quote(string));
                        Pattern compile = Pattern.compile(AnonymousClass000.A0X(").*?([0-9]{3})-([0-9]{3})", A0o2));
                        for (Object obj : objArr) {
                            String str2 = null;
                            try {
                                if (C107385bE.A02()) {
                                    smsMessage = SmsMessage.createFromPdu((byte[]) obj, extras.getString("format"));
                                } else {
                                    smsMessage = SmsMessage.createFromPdu((byte[]) obj);
                                }
                                if (smsMessage != null) {
                                    try {
                                        str2 = smsMessage.getMessageBody();
                                        C18260x0.A0s("verifysms/getMessageBody ", str2, AnonymousClass001.A0o());
                                        StringBuilder A0o3 = AnonymousClass001.A0o();
                                        A0o3.append("verifysms/displayMessageBody ");
                                        C18260x0.A1L(A0o3, smsMessage.getDisplayMessageBody());
                                        StringBuilder A0o4 = AnonymousClass001.A0o();
                                        A0o4.append("verifysms/displayOriginatingAddress ");
                                        C18260x0.A1L(A0o4, smsMessage.getDisplayOriginatingAddress());
                                        StringBuilder A0o5 = AnonymousClass001.A0o();
                                        A0o5.append("verifysms/emailBody ");
                                        C18260x0.A1L(A0o5, smsMessage.getEmailBody());
                                        StringBuilder A0o6 = AnonymousClass001.A0o();
                                        A0o6.append("verifysms/emailFrom ");
                                        C18260x0.A1L(A0o6, smsMessage.getEmailFrom());
                                        StringBuilder A0o7 = AnonymousClass001.A0o();
                                        A0o7.append("verifysms/getOriginatingAddress ");
                                        C18260x0.A1L(A0o7, smsMessage.getOriginatingAddress());
                                        StringBuilder A0o8 = AnonymousClass001.A0o();
                                        A0o8.append("verifysms/getPseudoSubject ");
                                        C18260x0.A1L(A0o8, smsMessage.getPseudoSubject());
                                        StringBuilder A0o9 = AnonymousClass001.A0o();
                                        A0o9.append("verifysms/getServiceCenterAddress ");
                                        C18260x0.A1L(A0o9, smsMessage.getServiceCenterAddress());
                                    } catch (NullPointerException e) {
                                        Log.e("verifysms", e);
                                    }
                                    if (str2 == null) {
                                        Log.i("receivedtextreceiver/message-null");
                                    } else {
                                        C18260x0.A0s("verifysms/text-receiver/", str2, AnonymousClass001.A0o());
                                        Matcher matcher = compile.matcher(str2);
                                        if (matcher.find()) {
                                            StringBuilder A0o10 = AnonymousClass001.A0o();
                                            A0o10.append(matcher.group(1));
                                            String A0X = AnonymousClass000.A0X(matcher.group(2), A0o10);
                                            if (A0X != null) {
                                                if (C615531h.A01(A0X, -1) != -1) {
                                                    this.A00 = true;
                                                    abortBroadcast();
                                                    verifyPhoneNumber.A7y(A0X);
                                                } else {
                                                    Log.w("verifysms/text-receiver/no-code");
                                                    AnonymousClass36l.A0O(this.A01, "server-send-mismatch-empty");
                                                }
                                            }
                                        }
                                        Log.w("verifysms/text-receiver/not_sms_verification");
                                    }
                                }
                            } catch (OutOfMemoryError e2) {
                                Log.e("verifysms/text/out-of-memory ", e2);
                            }
                        }
                        return;
                    }
                }
            }
        }
        Log.i(str);
    }

    public AnonymousClass4LR(AnonymousClass33p r2, VerifyPhoneNumber verifyPhoneNumber) {
        this();
        this.A03 = AnonymousClass0x9.A14(verifyPhoneNumber);
        this.A01 = r2;
    }

    public AnonymousClass4LR() {
        this.A04 = false;
        this.A02 = AnonymousClass002.A0D();
    }
}
