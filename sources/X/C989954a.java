package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.54a  reason: invalid class name and case insensitive filesystem */
public class C989954a extends AnonymousClass5ZM {
    public final C989053r A00;
    public final WeakReference A01;

    public C989954a(C15910sA r2, AnonymousClass5JG r3, C989053r r4) {
        super(r2, true);
        this.A00 = r4;
        this.A01 = AnonymousClass0x9.A14(r3);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        try {
            Bitmap A0B = this.A00.A0B(Uri.fromFile(((File[]) objArr)[0]), 100, 100);
            byte[] A1Y = C18320x8.A1Y(A0B, new ByteArrayOutputStream());
            A0B.recycle();
            return A1Y;
        } catch (Exception e) {
            Log.e("create-product-reply/", e);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        byte[] bArr = (byte[]) obj;
        AnonymousClass5JG r0 = (AnonymousClass5JG) this.A01.get();
        if (r0 != null) {
            AnonymousClass4VQ r4 = r0.A03;
            C109015dw r5 = r0.A01;
            C103025Le r7 = r0.A02;
            AnonymousClass33C r9 = r0.A00;
            try {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("product_inquiry:");
                String A0X = AnonymousClass000.A0X(r5.A0F, A0o);
                UserJid userJid = r7.A0A;
                C30771mz r2 = new C30771mz(new AnonymousClass2z0(userJid, A0X, false), r4.A0i.A0H());
                r2.A01 = r9;
                r2.A0y().A03(bArr);
                r5.A00(r2);
                if (userJid != null) {
                    r2.A01 = userJid;
                }
                r4.A0S(r2);
            } catch (Exception e) {
                Log.e("create-product-reply/", e);
            }
            if (bArr == null) {
                Log.i("create-product-reply/creating product reply without media");
                C30481mW r3 = new C30481mW(r4.A10.A04(r7.A0A, false), r4.A0i.A0H());
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append('*');
                String A0X2 = AnonymousClass000.A0X(r5.A05, A0o2);
                String str = r5.A0C;
                if (!C107575bX.A0F(str)) {
                    A0X2 = AnonymousClass000.A0V("*\n", str, AnonymousClass000.A0l(A0X2));
                }
                r3.A1Z(A0X2);
                r4.A0S(r3);
            }
        }
    }
}
