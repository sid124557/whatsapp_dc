package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.6Wd  reason: invalid class name and case insensitive filesystem */
public final class C128456Wd extends AnonymousClass6E0 {
    public final /* synthetic */ AnonymousClass7X1 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128456Wd(Looper looper, AnonymousClass7X1 r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        String str;
        Bundle bundle;
        AnonymousClass7X1 r3 = this.A00;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C140816uZ());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C165917xq) {
                        r3.A02 = (C165917xq) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        r3.A01 = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            AnonymousClass6C7.A1F("Unexpected response, no error or registration id ", valueOf, "FirebaseInstanceId", AnonymousClass6CA.A0Y(valueOf.length() + 49));
                            return;
                        }
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            Log.d("FirebaseInstanceId", AnonymousClass6C7.A0k("Received InstanceID error ", stringExtra2, stringExtra2.length()));
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !"ID".equals(split[1])) {
                                Log.w("FirebaseInstanceId", AnonymousClass6C7.A0k("Unexpected structured response ", stringExtra2, stringExtra2.length()));
                                return;
                            }
                            str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            bundle = intent2.putExtra("error", str2).getExtras();
                        } else {
                            C06290Wz r5 = r3.A04;
                            synchronized (r5) {
                                for (int i = 0; i < r5.size(); i++) {
                                    r3.A01((String) r5.A02[i << 1], intent2.getExtras());
                                }
                            }
                            return;
                        }
                    } else {
                        Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                        if (matcher.matches()) {
                            str = matcher.group(1);
                            String group = matcher.group(2);
                            bundle = intent2.getExtras();
                            bundle.putString("registration_id", group);
                        } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            Log.d("FirebaseInstanceId", AnonymousClass6C7.A0k("Unexpected response string: ", stringExtra, stringExtra.length()));
                            return;
                        } else {
                            return;
                        }
                    }
                    r3.A01(str, bundle);
                    return;
                } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", AnonymousClass6C7.A0j("Unexpected response action: ", action));
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("FirebaseInstanceId", "Dropping invalid message");
    }
}
