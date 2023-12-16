package X;

import android.content.Intent;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.contentprovider.MediaProvider;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.1tj  reason: invalid class name and case insensitive filesystem */
public class C33811tj extends AnonymousClass5ZM {
    public final C64393Dh A00;
    public final C56612sH A01;
    public final C84894Ed A02;
    public final C369320h A03;
    public final WeakReference A04;

    public C33811tj(C89654ea r2, C64393Dh r3, C56612sH r4, C84894Ed r5, C369320h r6) {
        super(r2, true);
        this.A01 = r4;
        this.A00 = r3;
        this.A04 = AnonymousClass0x9.A14(r2);
        this.A02 = r5;
        this.A03 = r6;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        File A012;
        String str;
        FileOutputStream A0h;
        C64393Dh r3 = this.A00;
        C627536m.A0E(r3.A0C(), 0);
        String A0Y = C18280x3.A0Y();
        C369320h r1 = this.A03;
        if (r1 == C369320h.ACCOUNT) {
            A012 = C54292oU.A01(r3);
            str = "gdpr.zip";
        } else {
            if (r1 == C369320h.NEWSLETTER) {
                A012 = C54292oU.A01(r3);
                str = "channels_gdpr.zip";
            }
            return null;
        }
        File A0A = AnonymousClass002.A0A(A012, str);
        File A05 = C64393Dh.A05(r3.A0C(), ".zip", AnonymousClass000.A0l(A0Y));
        try {
            FileInputStream A0g = AnonymousClass0x9.A0g(A0A);
            try {
                A0h = AnonymousClass0x9.A0h(A05);
                C627536m.A0I(A0g, A0h);
                A0h.close();
                A0g.close();
                if (A05.setLastModified(this.A01.A0H())) {
                    return A0Y;
                }
                Log.e("gdprreportactivity/failed to update report file");
                return null;
            } catch (Throwable th) {
                A0g.close();
                throw th;
            }
            throw th;
        } catch (IOException e) {
            Log.e("gdprreportactivity/can't prepare report file", e);
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public void A0A() {
        C89654ea A0F = C18320x8.A0F(this.A04);
        if (A0F != null && !A0F.BHW()) {
            this.A02.BpA(0, R.string.f11nameremoved);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String str;
        String str2 = (String) obj;
        C89654ea A0F = C18320x8.A0F(this.A04);
        if (A0F != null && !A0F.BHW()) {
            C84894Ed r3 = this.A02;
            r3.BjL();
            if (str2 != null) {
                C369320h r4 = this.A03;
                C89704el r32 = (C89704el) r3;
                Intent intent = new Intent("android.intent.action.SEND", Uri.parse("mailto:"));
                if (r4 == C369320h.ACCOUNT) {
                    str = "gdpr_report";
                } else if (r4 == C369320h.NEWSLETTER) {
                    str = "channels_gdpr_report";
                } else {
                    throw AnonymousClass000.A0H(r4, "MediaProvider/getGdprMediaUri/unexpected gdprReportType: ", AnonymousClass001.A0o());
                }
                intent.putExtra("android.intent.extra.STREAM", MediaProvider.A06(str, str2));
                intent.setType("application/zip");
                intent.addFlags(524288);
                r32.startActivityForResult(Intent.createChooser(intent, (CharSequence) null), 0);
            }
        }
    }
}
