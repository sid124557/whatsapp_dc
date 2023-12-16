package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;

/* renamed from: X.364  reason: invalid class name */
public class AnonymousClass364 {
    public int A00 = 5242880;
    public final C55682qk A01;
    public final C56492s4 A02;
    public final C54292oU A03;
    public final AnonymousClass4FV A04;
    public final C55132pq A05;
    public final AnonymousClass3FI A06;
    public final AnonymousClass4FS A07;

    public static final void A01(FileOutputStream fileOutputStream, Boolean bool, String str) {
        if (bool != null) {
            try {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(";");
                A0o.append(str);
                AnonymousClass0x2.A1L(AnonymousClass000.A0P(bool, ":", A0o), fileOutputStream);
            } catch (IOException e) {
                C18260x0.A0v("app/VoipTimeSeriesLogger: couldn't inject FS ", str, AnonymousClass001.A0o(), e);
            }
        }
    }

    public static final void A02(FileOutputStream fileOutputStream, Double d, String str) {
        if (d != null) {
            try {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(";");
                C18290x4.A1R(A0o, str);
                AnonymousClass0x2.A1L(AnonymousClass000.A0X(String.format(Locale.US, "%.2f", AnonymousClass000.A1b(d)), A0o), fileOutputStream);
            } catch (IOException e) {
                C18260x0.A0v("app/VoipTimeSeriesLogger: couldn't inject FS ", str, AnonymousClass001.A0o(), e);
            }
        }
    }

    public static final void A03(FileOutputStream fileOutputStream, Integer num, String str) {
        if (num != null) {
            try {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(";");
                A0o.append(str);
                AnonymousClass0x2.A1L(AnonymousClass000.A0P(num, ":", A0o), fileOutputStream);
            } catch (IOException e) {
                C18260x0.A0v("app/VoipTimeSeriesLogger: couldn't inject FS ", str, AnonymousClass001.A0o(), e);
            }
        }
    }

    public static final void A04(FileOutputStream fileOutputStream, Long l, String str) {
        if (l != null) {
            try {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(";");
                A0o.append(str);
                AnonymousClass0x2.A1L(AnonymousClass000.A0P(l, ":", A0o), fileOutputStream);
            } catch (IOException e) {
                C18260x0.A0v("app/VoipTimeSeriesLogger: couldn't inject FS ", str, AnonymousClass001.A0o(), e);
            }
        }
    }

    public static final void A05(FileOutputStream fileOutputStream, String str, String str2) {
        if (str2 != null) {
            try {
                String replaceAll = str2.replaceAll(":", "_").replaceAll(";", "_");
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A0p(";", str, ":", replaceAll, A0o);
                AnonymousClass0x2.A1L(A0o.toString(), fileOutputStream);
            } catch (IOException e) {
                C18260x0.A0v("app/VoipTimeSeriesLogger: couldn't inject FS ", str, AnonymousClass001.A0o(), e);
            }
        }
    }

    public final boolean A07(WamCall wamCall, File file) {
        FileInputStream A0g;
        File file2 = file;
        boolean z = false;
        if (file2.exists()) {
            C55682qk r5 = this.A01;
            String A062 = r5.A06();
            C614230q r8 = new C614230q(this.A02, new AnonymousClass4JV(file2, 0, this), this.A05, "https://crashlogs.whatsapp.net/wa_clb_data", this.A06.A00(), (String) null, 16, false, false, false);
            r8.A08("access_token", "1063127757113399|745146ffa34413f9dbb5469f5370b7af");
            r8.A09("from_jid", A062);
            r8.A09("tags", "voip_time_series");
            WamCall wamCall2 = wamCall;
            if (wamCall != null) {
                String str = wamCall2.callReplayerId;
                if (str != null && str.length() > 0) {
                    r8.A09("call_id", str);
                }
                Long l = wamCall2.maxConnectedParticipants;
                if (l != null) {
                    r8.A09("additional_metadata[max_participants]", l.toString());
                }
                Long l2 = wamCall2.numConnectedParticipants;
                if (l2 != null) {
                    r8.A09("additional_metadata[num_participants]", l2.toString());
                }
            }
            try {
                A0g = AnonymousClass0x9.A0g(file2);
                C614230q.A01(r8, file2, A0g, "file");
                int A032 = r8.A03((AnonymousClass7US) null);
                if (A032 >= 400) {
                    C18260x0.A0z("app/VoiceService: upload of time series log date failed with response code: ", AnonymousClass001.A0o(), A032);
                    z = false;
                } else {
                    z = true;
                }
                A0g.close();
                if (!file2.delete()) {
                    Log.i("app/VoiceService: dummy time series log could not be deleted");
                    return z;
                }
            } catch (IOException e) {
                try {
                    Log.w("app/VoiceService: could not upload dummy time series log data", e);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append(file2.length());
                    r5.A0A("voip-time-series-upload-fail", true, AnonymousClass000.A0X(":uploadError:", A0o));
                } finally {
                    if (!file2.delete()) {
                        Log.i("app/VoiceService: dummy time series log could not be deleted");
                    }
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return z;
        throw th;
    }

    public AnonymousClass364(C55682qk r2, C56492s4 r3, C54292oU r4, AnonymousClass4FV r5, C55132pq r6, AnonymousClass3FI r7, AnonymousClass4FS r8) {
        this.A01 = r2;
        this.A03 = r4;
        this.A07 = r8;
        this.A06 = r7;
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = r6;
    }

    public static /* synthetic */ void A00(AnonymousClass364 r14) {
        FileOutputStream A0h;
        Integer A012 = Voip.A01("options.wa_call_dummy_size");
        if (A012 == null) {
            r14.A01.A0A("voip-time-series-upload-fail", false, ":dummyFileSizeUndefined:");
            return;
        }
        File A042 = C627436k.A04(r14.A03.A00);
        if (A042 == null) {
            C55682qk r2 = r14.A01;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(A012.intValue() * EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
            r2.A0A("voip-time-series-upload-fail", false, AnonymousClass000.A0X(":voipDirectoryError:", A0o));
            return;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("dummy_");
        StringBuilder A0o3 = AnonymousClass001.A0o();
        int i = 0;
        do {
            A0o3.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt((int) (Math.random() * ((double) 62))));
            i++;
        } while (i < 6);
        File A0A = C18270x1.A0A(A042, A0o3.toString(), A0o2);
        StringBuilder A0o4 = AnonymousClass001.A0o();
        C18260x0.A1L(A0o4, AnonymousClass0x7.A0o(A0A, "app/VoiceService: putting dummy time series at ", A0o4));
        byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
        AnonymousClass0x9.A1C().nextBytes(bArr);
        try {
            A0h = AnonymousClass0x9.A0h(A0A);
            for (int i2 = 0; i2 < A012.intValue(); i2++) {
                A0h.write(bArr);
            }
            A0h.close();
            r14.A07((WamCall) null, A0A);
            return;
        } catch (IOException e) {
            Log.w("app/VoiceService: could not create dummy time series", e);
            C55682qk r22 = r14.A01;
            StringBuilder A0o5 = AnonymousClass001.A0o();
            A0o5.append(String.valueOf(A012.intValue() * EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH));
            r22.A0A("voip-time-series-upload-fail", true, AnonymousClass000.A0X(":fileCreationError:", A0o5));
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void A06(WamCall wamCall, String str) {
        this.A07.BkM(new C71593cM((Object) this, (Object) AnonymousClass002.A0B(str), (Object) wamCall, (Object) new AnonymousClass1Y7(), 25));
    }
}
