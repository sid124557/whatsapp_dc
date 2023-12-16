package com.whatsapp.otp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass2A1;
import X.AnonymousClass2HY;
import X.AnonymousClass2HZ;
import X.C116975rB;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18320x8;
import X.C25941bK;
import X.C42492Oh;
import X.C55042ph;
import X.C56612sH;
import X.C58422vE;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.util.Log;

public final class OtpRequestedReceiver extends BroadcastReceiver {
    public C56612sH A00;
    public AnonymousClass2HY A01;
    public C55042ph A02;
    public C42492Oh A03;
    public AnonymousClass2HZ A04;
    public final Object A05;
    public volatile boolean A06;

    public final C55042ph A00() {
        C55042ph r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("loggingUtil");
    }

    public void onReceive(Context context, Intent intent) {
        RuntimeException runtimeException;
        if (!this.A06) {
            synchronized (this.A05) {
                if (!this.A06) {
                    AnonymousClass2A1.A00(context).ARU(this);
                    this.A06 = true;
                }
            }
        }
        C18260x0.A0O(context, intent);
        try {
            A00();
            Log.i("Wa-otp-handshake: handshake intent received");
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("_ci_");
            if (pendingIntent != null) {
                String creatorPackage = pendingIntent.getCreatorPackage();
                if (creatorPackage == null) {
                    creatorPackage = "";
                }
                String stringExtra = intent.getStringExtra("request_id");
                AnonymousClass2HY r0 = this.A01;
                if (r0 != null) {
                    AnonymousClass1VX r1 = r0.A00;
                    C58422vE r6 = C58422vE.A02;
                    if (!r1.A0Y(r6, 6617) || stringExtra == null || !C18280x3.A1X(stringExtra, new C116975rB("^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$").nativePattern)) {
                        stringExtra = null;
                    }
                    C42492Oh r5 = this.A03;
                    if (r5 == null) {
                        runtimeException = C18270x1.A0S("otpStateManager");
                    } else if (this.A00 != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String A0Y = C18280x3.A0Y();
                        C162457s7.A0D(A0Y);
                        r5.A02.put(creatorPackage, Long.valueOf(elapsedRealtime));
                        r5.A00.put(creatorPackage, A0Y);
                        if (stringExtra != null) {
                            r5.A01.put(creatorPackage, stringExtra);
                        }
                        String stringExtra2 = intent.getStringExtra("SDK_VERSION");
                        C55042ph A002 = A00();
                        C25941bK r12 = new C25941bK();
                        r12.A07 = C18280x3.A0S();
                        r12.A06 = AnonymousClass0x7.A0g();
                        r12.A0I = creatorPackage;
                        r12.A0C = A0Y;
                        r12.A0E = stringExtra2;
                        A002.A00(r12);
                        A002.A06.BhD(r12);
                        A00();
                        Log.i("Wa-otp-handshake: handshake intent registered");
                        AnonymousClass2HY r02 = this.A01;
                        if (r02 == null) {
                            runtimeException = C18270x1.A0S("otpGatingManager");
                        } else if (r02.A00.A0Y(r6, 6617) && stringExtra != null) {
                            if (this.A04 != null) {
                                Intent A07 = C18320x8.A07();
                                A07.setPackage(creatorPackage);
                                A07.setAction("com.whatsapp.otp.OTP_HANDSHAKE_CONFIRMATION");
                                A07.putExtra("request_id", stringExtra);
                                context.sendBroadcast(A07);
                                return;
                            }
                            runtimeException = C18270x1.A0S("otpClient");
                        } else {
                            return;
                        }
                    } else {
                        runtimeException = C18270x1.A0S("time");
                    }
                } else {
                    runtimeException = C18270x1.A0S("otpGatingManager");
                }
                throw runtimeException;
            }
            A00().A03("OTP intent has no caller info");
            A00();
            Log.w("Wa-otp-handshake: PendingIntent missing from handshake Intent");
        } catch (Exception e) {
            Log.e("OTP: Error while unmarshalling", e);
            C55042ph A003 = A00();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(AnonymousClass000.A0O(e));
            A003.A03(AnonymousClass000.A0a(" / ", A0o, e));
        }
    }

    public OtpRequestedReceiver(int i) {
        this.A06 = false;
        this.A05 = AnonymousClass002.A0D();
    }

    public OtpRequestedReceiver() {
        this(0);
    }
}
