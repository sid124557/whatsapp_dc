package X;

import android.database.Cursor;
import com.whatsapp.gallery.GalleryFragmentBase;
import java.lang.ref.WeakReference;

/* renamed from: X.55P  reason: invalid class name */
public class AnonymousClass55P extends AnonymousClass5ZM {
    public AnonymousClass0QU A00;
    public final C95814uZ A01;
    public final C56532s8 A02;
    public final WeakReference A03;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Cursor A1J;
        GalleryFragmentBase galleryFragmentBase = (GalleryFragmentBase) this.A03.get();
        AnonymousClass4MC r6 = this.A02;
        if (r6.isCancelled() || galleryFragmentBase == null) {
            return null;
        }
        AnonymousClass0QU r2 = new AnonymousClass0QU();
        synchronized (this) {
            this.A00 = r2;
        }
        try {
            StringBuilder A0o = AnonymousClass001.A0o();
            String str = galleryFragmentBase.A0J;
            A0o.append(str);
            AnonymousClass33M r3 = new AnonymousClass33M(AnonymousClass000.A0X("/getCursor", A0o));
            A1J = galleryFragmentBase.A1J(r2, this.A01, this.A02);
            r3.A07();
            if (A1J != null) {
                StringBuilder A0l = AnonymousClass000.A0l(str);
                A0l.append("/loadInBackground ");
                C18260x0.A1G(A0l, A1J.getCount());
            }
            synchronized (this) {
                this.A00 = null;
            }
            if (!r6.isCancelled() || A1J == null) {
                return A1J;
            }
            A1J.close();
            return null;
        } catch (RuntimeException e) {
            A1J.close();
            throw e;
        } catch (Throwable th) {
            th = th;
            synchronized (this) {
                try {
                    this.A00 = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a4 A[EDGE_INSN: B:33:0x00a4->B:27:0x00a4 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r13) {
        /*
            r12 = this;
            android.database.Cursor r13 = (android.database.Cursor) r13
            if (r13 == 0) goto L_0x00c6
            java.lang.ref.WeakReference r0 = r12.A03
            java.lang.Object r8 = r0.get()
            com.whatsapp.gallery.GalleryFragmentBase r8 = (com.whatsapp.gallery.GalleryFragmentBase) r8
            if (r8 == 0) goto L_0x00c6
            X.2s8 r10 = r12.A02
            int r4 = r13.getCount()
            r7 = 0
            android.view.View r1 = r8.A0B
            if (r1 == 0) goto L_0x001f
            r0 = 2131432722(0x7f0b1512, float:1.848721E38)
            X.C86624Kv.A0u(r1, r0)
        L_0x001f:
            android.view.View r2 = r8.A0B
            if (r2 == 0) goto L_0x00c6
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r3 = r8.A0J
            r1.append(r3)
            java.lang.String r0 = "/onLoadFinished "
            X.C18260x0.A0y(r0, r1, r4)
            r8.A00 = r4
            r8.A1L()
            X.55X r0 = r8.A0C
            if (r0 == 0) goto L_0x003d
            r0.A0G()
        L_0x003d:
            java.util.ArrayList r6 = r8.A0K
            r6.clear()
            int r2 = r2.getHeight()
            android.content.res.Resources r1 = X.C08310eF.A09(r8)
            r0 = 2131168246(0x7f070bf6, float:1.7950788E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r2 = r2 / r0
            int r5 = r2 + 1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r3)
            java.lang.String r0 = "/approxScreenItemCount "
            X.C18260x0.A0y(r0, r1, r5)
            android.content.Context r1 = r8.A0G()
            X.33j r0 = r8.A05
            X.7U5 r4 = new X.7U5
            r4.<init>(r1, r0)
            boolean r0 = r13.moveToFirst()
            r3 = 0
            if (r0 == 0) goto L_0x00a7
            r2 = 0
        L_0x0070:
            boolean r0 = r13 instanceof X.C86684Lb
            if (r0 == 0) goto L_0x00c7
            r0 = r13
            X.4Lb r0 = (X.C86684Lb) r0
            X.1mV r0 = r0.A00()
        L_0x007b:
            X.C626936e.A06(r0)
            X.34x r0 = (X.C624134x) r0
            long r0 = r0.A0K
            X.5tK r1 = r4.A00(r0)
            if (r3 == 0) goto L_0x0091
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L_0x0094
            r6.add(r3)
        L_0x0091:
            r1.count = r7
            r3 = r1
        L_0x0094:
            int r0 = r3.count
            int r0 = r0 + 1
            r3.count = r0
            int r2 = r2 + 1
            boolean r0 = r13.moveToNext()
            if (r0 == 0) goto L_0x00a4
            if (r2 < r5) goto L_0x0070
        L_0x00a4:
            r6.add(r3)
        L_0x00a7:
            X.4X2 r0 = r8.A0A
            android.database.Cursor r0 = r0.A0K(r13)
            if (r0 == 0) goto L_0x00b2
            r0.close()
        L_0x00b2:
            X.33j r6 = r8.A05
            X.2qz r11 = r8.A0F
            X.1hj r7 = r8.A08
            X.4uZ r9 = r8.A0D
            X.55X r5 = new X.55X
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r8.A0C = r5
            X.4FS r0 = r8.A0G
            X.AnonymousClass0x7.A1B(r5, r0)
        L_0x00c6:
            return
        L_0x00c7:
            X.2qz r1 = r8.A0F
            X.4uZ r0 = r8.A0D
            X.34x r0 = r1.A04(r13, r0)
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass55P.A0C(java.lang.Object):void");
    }

    public AnonymousClass55P(GalleryFragmentBase galleryFragmentBase, C95814uZ r3, C56532s8 r4) {
        this.A03 = AnonymousClass0x9.A14(galleryFragmentBase);
        this.A01 = r3;
        this.A02 = r4;
    }
}
