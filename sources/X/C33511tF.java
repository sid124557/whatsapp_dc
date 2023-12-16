package X;

import android.content.Intent;
import android.graphics.Bitmap;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;

/* renamed from: X.1tF  reason: invalid class name and case insensitive filesystem */
public class C33511tF extends AnonymousClass5ZM {
    public final C64393Dh A00;
    public final C69263Wi A01;
    public final C56972sr A02;
    public final String A03;
    public final WeakReference A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        FileOutputStream fileOutputStream;
        Bitmap bitmap = ((Bitmap[]) objArr)[0];
        C626936e.A06(bitmap);
        File A002 = C64393Dh.A00(this.A00, "shared_qr_code.png");
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = AnonymousClass0x9.A0h(A002);
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 0, fileOutputStream);
                C624535b.A03(fileOutputStream);
                bitmap.recycle();
                return A002;
            } catch (FileNotFoundException e) {
                e = e;
                try {
                    Log.e("CreateSharedQrCardImageAsyncTask/shareFailed", e);
                    C624535b.A03(fileOutputStream);
                    bitmap.recycle();
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    C624535b.A03(fileOutputStream2);
                    bitmap.recycle();
                    throw th;
                }
            }
        } catch (FileNotFoundException e2) {
            e = e2;
            fileOutputStream = null;
            Log.e("CreateSharedQrCardImageAsyncTask/shareFailed", e);
            C624535b.A03(fileOutputStream);
            bitmap.recycle();
            return null;
        } catch (Throwable th2) {
            th = th2;
            C624535b.A03(fileOutputStream2);
            bitmap.recycle();
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        File file = (File) obj;
        C89654ea A0F = C18320x8.A0F(this.A04);
        if (A0F != null) {
            A0F.BjL();
            if (file == null) {
                this.A01.A0H(R.string.f11nameremoved, 0);
                return;
            }
            Intent A09 = AnonymousClass0x9.A09("android.intent.action.SEND");
            Object[] A0M = AnonymousClass002.A0M();
            C56972sr r1 = this.A02;
            A0M[0] = r1.A0D.A03();
            AnonymousClass1RR A012 = C56972sr.A01(r1);
            C626936e.A06(A012);
            A09.putExtra("android.intent.extra.SUBJECT", AnonymousClass002.A0F(A0F, AnonymousClass36P.A03(AnonymousClass3ZH.A01(A012)), A0M, 1, R.string.f11nameremoved));
            A09.putExtra("android.intent.extra.TEXT", this.A03);
            A09.putExtra("android.intent.extra.STREAM", C627536m.A01(A0F.getApplicationContext(), file));
            A09.setType("image/png");
            A09.addFlags(524288);
            A0F.A6T(Intent.createChooser(A09, (CharSequence) null), false);
        }
    }

    public C33511tF(C89654ea r2, C64393Dh r3, C69263Wi r4, C56972sr r5, String str) {
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = r3;
        this.A04 = AnonymousClass0x9.A14(r2);
        this.A03 = str;
    }
}
