package X;

import android.content.ContentValues;
import com.whatsapp.util.Log;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

/* renamed from: X.5s1  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117495s1 implements Runnable {
    public final /* synthetic */ AnonymousClass1Hk A00;
    public final /* synthetic */ AnonymousClass5KC A01;
    public final /* synthetic */ AnonymousClass5KW A02;
    public final /* synthetic */ AnonymousClass1VX A03;
    public final /* synthetic */ C624134x A04;
    public final /* synthetic */ WebPagePreviewView A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public final void run() {
        C85284Fq A042;
        AnonymousClass5KC r3 = this.A01;
        WebPagePreviewView webPagePreviewView = this.A05;
        AnonymousClass1VX r6 = this.A03;
        AnonymousClass1Hk r7 = this.A00;
        C624134x r5 = this.A04;
        boolean z = this.A07;
        List list = this.A06;
        boolean z2 = this.A08;
        AnonymousClass5KW r8 = this.A02;
        C103945Pa r0 = (C103945Pa) webPagePreviewView.getTag();
        try {
            AnonymousClass1Hk r4 = r0.A00;
            if (!r4.A0O.isEmpty()) {
                r4.A0C(r6, (String) r4.A0O.toArray()[0]);
            }
            C624134x r2 = r0.A01;
            AnonymousClass2U8 r42 = r2.A0c;
            if (r42 != null) {
                byte[] bArr = r7.A0W;
                if (bArr == null) {
                    bArr = r7.A0V;
                }
                r42.A00 = bArr;
            }
            if (r2.A1J.A01.equals(r5.A1J.A01)) {
                r3.A00.A0S(new C117375rp(r7, r8, webPagePreviewView, list, z, z2));
            }
            byte[] bArr2 = r7.A0W;
            if (!(bArr2 == null && (bArr2 = r7.A0V) == null)) {
                C47972e8 r43 = r3.A02;
                long j = r2.A1L;
                A042 = r43.A00.A04();
                ContentValues A062 = AnonymousClass0x9.A06();
                A062.put("full_thumbnail", bArr2);
                C56862sg r62 = ((AnonymousClass3H0) A042).A03;
                String[] strArr = new String[1];
                C18260x0.A1X(strArr, j);
                if (r62.A05(A062, "message_external_ad_content", "message_row_id=?", "ExternalAdContentInfoStore/updateFullThumbnail", strArr) == 0) {
                    Log.e("ExternalAdContentInfoStore/updateFullThumbnail/full thumbnail wasn't updated");
                }
                A042.close();
            }
        } catch (IOException | URISyntaxException e) {
            Log.w("ConversationPageInfoLoader/load/failed to load thumb", e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        r3.A05.remove(r0.A01.A1J.A01);
        return;
        throw th;
    }

    public /* synthetic */ C117495s1(AnonymousClass1Hk r1, AnonymousClass5KC r2, AnonymousClass5KW r3, AnonymousClass1VX r4, C624134x r5, WebPagePreviewView webPagePreviewView, List list, boolean z, boolean z2) {
        this.A01 = r2;
        this.A05 = webPagePreviewView;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A07 = z;
        this.A06 = list;
        this.A08 = z2;
        this.A02 = r3;
    }
}
