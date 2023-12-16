package X;

import android.content.Intent;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.5qM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C116485qM implements C84134Bd {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C89654ea A03;
    public final /* synthetic */ AnonymousClass3XA A04;
    public final /* synthetic */ AnonymousClass5XF A05;
    public final /* synthetic */ C109015dw A06;
    public final /* synthetic */ C152967aS A07;
    public final /* synthetic */ C95814uZ A08;
    public final /* synthetic */ UserJid A09;
    public final /* synthetic */ List A0A;
    public final /* synthetic */ boolean A0B;

    public final void AwB(Object obj) {
        C624134x r19;
        AnonymousClass5XF r11 = this.A05;
        int i = this.A00;
        List list = this.A0A;
        boolean z = this.A0B;
        C89654ea r10 = this.A03;
        int i2 = this.A01;
        C95814uZ r9 = this.A08;
        C109015dw r8 = this.A06;
        UserJid userJid = this.A09;
        long j = this.A02;
        C152967aS r22 = this.A07;
        AnonymousClass3XA r21 = this.A04;
        AnonymousClass0PJ r14 = (AnonymousClass0PJ) obj;
        if (i == list.size() - 1) {
            AnonymousClass316 A002 = C105255Ue.A00(r11.A09, "send_product_message_tag");
            if (A002 == null) {
                Log.d("BizQPLManager/endImageUploadBlock/pref tracker not found. Have you called startPrefTracker()?");
            } else {
                A002.A09("image_upload");
            }
            if (!z) {
                r10.BjL();
            }
        }
        File file = (File) r14.A01;
        if (r14.A00 == Boolean.FALSE) {
            r10.BjL();
            r10.Bot(R.string.f11nameremoved);
            Log.w("product-details/send-product/product load failed");
            r11.A09.A06("send_product_message_tag", false);
            Log.w("product-details/send-product/temp file creation failed");
        } else {
            if (i2 == 2) {
                Intent A1O = C86664Kz.A1B().A1O(r10, r9, 0);
                A1O.putExtra("product", r8);
                A1O.putExtra("product_file", file);
                A1O.putExtra("_ci_", C624735e.A01(r10, 0, C18320x8.A07(), 0));
                AnonymousClass0x2.A0u(A1O, userJid, "business_jid");
                AnonymousClass5VI.A00(A1O, "CatalogUtils");
                r10.startActivity(A1O);
            } else {
                Uri fromFile = Uri.fromFile(file);
                if (i2 != 1 || r9 == null) {
                    HashSet A0K = AnonymousClass002.A0K();
                    C18270x1.A1K(A0K, 23);
                    AnonymousClass5PH r1 = new AnonymousClass5PH(r10);
                    r1.A0H = true;
                    r1.A0L = true;
                    r1.A0V = file.getAbsolutePath();
                    r1.A0Z = AnonymousClass002.A0J(A0K);
                    r10.startActivityForResult(AnonymousClass5PH.A01(r1), 3);
                } else {
                    if (j > 0) {
                        r19 = C55122pp.A00(r11.A0A, j);
                    } else {
                        r19 = null;
                    }
                    C621033m r4 = r11.A04;
                    r4.A1r.BkM(new C71723cZ(fromFile, r4, r8, userJid, r19, Collections.singletonList(r9)));
                    if (i < AnonymousClass002.A04(list, 1)) {
                        List list2 = list;
                        C89654ea r12 = r10;
                        C152967aS r13 = r22;
                        r11.A01(r12, r13, r9, userJid, list2, 1, i + 1, j);
                    } else {
                        C18290x4.A18(r10);
                    }
                }
            }
            r11.A09.A06("send_product_message_tag", true);
        }
        r21.A02();
    }

    public /* synthetic */ C116485qM(C89654ea r1, AnonymousClass3XA r2, AnonymousClass5XF r3, C109015dw r4, C152967aS r5, C95814uZ r6, UserJid userJid, List list, int i, int i2, long j, boolean z) {
        this.A05 = r3;
        this.A00 = i;
        this.A0A = list;
        this.A0B = z;
        this.A03 = r1;
        this.A01 = i2;
        this.A08 = r6;
        this.A06 = r4;
        this.A09 = userJid;
        this.A02 = j;
        this.A07 = r5;
        this.A04 = r2;
    }
}
