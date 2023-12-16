package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5kx  reason: invalid class name and case insensitive filesystem */
public abstract class C113145kx implements AnonymousClass66W, C16910uE {
    public AnonymousClass654 A00;
    public AnonymousClass1VX A01;
    public Integer A02;
    public final Context A03;
    public final C89644eZ A04;
    public final C64773Ex A05;
    public final AnonymousClass5ZU A06;
    public final C104135Pu A07 = new C104135Pu();
    public final AnonymousClass5RO A08;
    public final AnonymousClass655 A09;
    public final C104555Rk A0A;
    public final C620733j A0B;
    public final AnonymousClass5Y0 A0C;
    public final Map A0D = AnonymousClass001.A0t();

    public abstract void A00();

    public boolean BLz(MenuItem menuItem, AnonymousClass0R2 r8) {
        C162457s7.A0J(menuItem, 1);
        Collection BCf = BCf();
        if (BCf != null && !BCf.isEmpty()) {
            if (!this.A09.B2s(this.A00, BCf, menuItem.getItemId())) {
                return false;
            }
            C1229266j A002 = this.A0A.A00(menuItem.getItemId());
            if (A002 != null && A002.B7f()) {
                A00();
            }
        }
        return true;
    }

    public boolean BQL(Menu menu, AnonymousClass0R2 r13) {
        C162457s7.A0J(menu, 1);
        if ((menu instanceof C07890cz) && C106545Zk.A00(this.A01)) {
            ((C07890cz) menu).A0H = true;
        }
        AnonymousClass5RO r4 = this.A08;
        C104555Rk r3 = this.A0A;
        Set keySet = ((Map) r3.A00.getValue()).keySet();
        C162457s7.A0J(keySet, 0);
        Iterator it = AnonymousClass6A5.A00(keySet, new C1222163n(r4), 3).iterator();
        while (it.hasNext()) {
            int A052 = C18280x3.A05(it);
            C1229266j A002 = r3.A00(A052);
            if (A002 == null) {
                C626936e.A0D(false, "Action id returned from repository provided a null action!");
            } else {
                String BDk = A002.BDk(this);
                C89644eZ r1 = this.A04;
                MenuItem add = menu.add(0, A052, 0, C107345b9.A05(r1, this.A0C, BDk));
                Drawable B8D = A002.B8D(r1, this.A0B);
                if (B8D != null) {
                    Integer num = this.A02;
                    if (num != null) {
                        B8D.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_ATOP);
                    }
                    add.setIcon(B8D);
                }
                Integer valueOf = Integer.valueOf(A052);
                Map map = this.A0D;
                C162457s7.A0H(add);
                map.put(valueOf, add);
                int ordinal = r4.A01(A052).ordinal();
                if (ordinal == 0) {
                    this.A07.A02.add(valueOf);
                } else if (ordinal == 2) {
                    C86654Ky.A1R(this.A07.A01, A052);
                }
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [int, boolean] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0142  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BYg(android.view.Menu r11, X.AnonymousClass0R2 r12) {
        /*
            r10 = this;
            r6 = 0
            boolean r5 = X.AnonymousClass0x2.A1Y(r12, r11)
            java.util.Collection r3 = r10.BCf()
            if (r3 == 0) goto L_0x01d7
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x01d7
            java.util.Collection r1 = r10.BCf()
            if (r1 == 0) goto L_0x0076
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0076
            java.util.Iterator r0 = r1.iterator()
            X.34x r0 = X.C18300x5.A0T(r0)
        L_0x0025:
            X.C626936e.A06(r0)
            X.C162457s7.A0D(r0)
            boolean r0 = X.AnonymousClass2z0.A0C(r0)
            if (r0 == 0) goto L_0x004a
            X.1VX r1 = r10.A01
            if (r1 == 0) goto L_0x004a
            r0 = 6516(0x1974, float:9.131E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != r5) goto L_0x004a
            X.5Pu r1 = r10.A07
            r0 = 5
            java.util.Set r1 = r1.A01
            X.C86654Ky.A1R(r1, r0)
            r0 = 34
            X.C86654Ky.A1R(r1, r0)
        L_0x004a:
            java.util.Map r0 = r10.A0D
            java.util.Iterator r4 = X.AnonymousClass000.A0q(r0)
        L_0x0050:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0078
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r4)
            int r2 = X.C18280x3.A06(r0)
            java.lang.Object r1 = r0.getValue()
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            X.5Rk r0 = r10.A0A
            X.66j r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x0074
            boolean r0 = r0.BoM(r3)
        L_0x0070:
            r1.setVisible(r0)
            goto L_0x0050
        L_0x0074:
            r0 = 0
            goto L_0x0070
        L_0x0076:
            r0 = 0
            goto L_0x0025
        L_0x0078:
            int r0 = r3.size()
            if (r0 != r5) goto L_0x00b5
            java.util.Collection r1 = r10.BCf()
            if (r1 == 0) goto L_0x0114
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0114
            java.util.Iterator r0 = r1.iterator()
            X.34x r2 = X.C18300x5.A0T(r0)
        L_0x0092:
            X.C626936e.A06(r2)
            X.C162457s7.A0D(r2)
            X.2z0 r1 = r2.A1J
            X.4uZ r0 = r1.A00
            boolean r0 = X.C627336j.A0K(r0)
            if (r0 == 0) goto L_0x00b5
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x00ab
            int r1 = r2.A0D
            r0 = 6
            if (r1 != r0) goto L_0x00b5
        L_0x00ab:
            r0 = 11
            r10.A01(r0)
            r0 = 15
            r10.A01(r0)
        L_0x00b5:
            r0 = 17
            r10.A01(r0)
            r0 = 30
            r10.A01(r0)
            X.33j r0 = r10.A0B
            java.util.Locale r2 = X.C620733j.A02(r0)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            int r0 = r3.size()
            X.AnonymousClass000.A1P(r1, r0, r6)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r5)
            java.lang.String r0 = "%d"
            java.lang.String r0 = X.C86654Ky.A0n(r2, r0, r1)
            r12.A0B(r0)
            r1 = r10
            boolean r4 = r10 instanceof X.AnonymousClass685
            if (r4 == 0) goto L_0x0129
            X.685 r1 = (X.AnonymousClass685) r1
            int r0 = r1.A01
            int r0 = 6 - r0
            if (r0 != 0) goto L_0x0129
            java.lang.Object r3 = r1.A00
            com.whatsapp.storage.StorageUsageGalleryActivity r3 = (com.whatsapp.storage.StorageUsageGalleryActivity) r3
            X.5QO r0 = r3.A0E
            java.util.HashMap r0 = r0.A04
            java.util.Collection r0 = r0.values()
            java.util.HashMap r8 = X.AnonymousClass001.A0t()
            java.util.Iterator r7 = r0.iterator()
        L_0x00fc:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0117
            X.34x r1 = X.C18300x5.A0T(r7)
            boolean r0 = r1 instanceof X.C30471mV
            if (r0 == 0) goto L_0x00fc
            X.1mV r1 = (X.C30471mV) r1
            java.lang.String r2 = r1.A04
            long r0 = r1.A00
            X.AnonymousClass0x2.A1J(r2, r8, r0)
            goto L_0x00fc
        L_0x0114:
            r2 = 0
            goto L_0x0092
        L_0x0117:
            java.util.Iterator r9 = X.C18290x4.A10(r8)
            r1 = 0
        L_0x011d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x012b
            long r7 = X.C18270x1.A02(r9)
            long r1 = r1 + r7
            goto L_0x011d
        L_0x0129:
            r0 = 0
            goto L_0x013c
        L_0x012b:
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0129
            X.33j r3 = r3.A00
            r0 = 1
            android.util.Pair r0 = X.AnonymousClass35V.A00(r3, r1, r0, r6)
            java.lang.Object r0 = r0.first
            java.lang.String r0 = (java.lang.String) r0
        L_0x013c:
            r12.A0A(r0)
            r1 = r10
            if (r4 == 0) goto L_0x0149
            X.685 r1 = (X.AnonymousClass685) r1
            int r0 = r1.A01
            switch(r0) {
                case 2: goto L_0x0153;
                case 3: goto L_0x0170;
                default: goto L_0x0149;
            }
        L_0x0149:
            X.5Pu r2 = r10.A07
            X.4eZ r1 = r10.A04
            X.1VX r0 = r10.A01
            r2.A00(r1, r11, r0)
            return r5
        L_0x0153:
            r0 = 2
            r11.removeItem(r0)
            r0 = 3
            r11.removeItem(r0)
            r0 = 24
            r11.removeItem(r0)
            r0 = 25
            r11.removeItem(r0)
            r0 = 19
            r11.removeItem(r0)
            r0 = 20
            r11.removeItem(r0)
            goto L_0x0149
        L_0x0170:
            java.lang.Object r4 = r1.A00
            X.5l7 r4 = (X.C113245l7) r4
            r4.A0r()
            X.676 r0 = r4.A2z
            X.5QO r0 = r0.getSelectedMessages()
            if (r0 == 0) goto L_0x0149
            X.4eZ r1 = r1.A04
            int r0 = r11.size()
            if (r0 == 0) goto L_0x0149
            android.view.MenuItem r0 = r11.getItem(r6)
            int r0 = r0.getItemId()
            android.view.View r1 = r1.findViewById(r0)
            if (r1 == 0) goto L_0x0149
            android.view.ViewParent r0 = r1.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L_0x0149
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            r0 = 2131431456(0x7f0b1020, float:1.8484642E38)
            android.view.View r1 = r1.findViewById(r0)
            if (r1 == 0) goto L_0x0149
            android.graphics.Rect r0 = X.AnonymousClass001.A0N()
            r1.getGlobalVisibleRect(r0)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0149
            X.5W1 r3 = r4.A2g
            X.4uZ r2 = r4.A4J
            X.676 r0 = r4.A2z
            X.5QO r1 = r0.getSelectedMessages()
            r0 = 2
            X.4ro r1 = X.AnonymousClass5W1.A00(r1, r2, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04 = r0
            X.4FV r0 = r3.A02
            r0.BhD(r1)
            goto L_0x0149
        L_0x01d7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113145kx.BYg(android.view.Menu, X.0R2):boolean");
    }

    public final void A01(int i) {
        C1229266j A002;
        MenuItem menuItem = (MenuItem) AnonymousClass001.A0i(this.A0D, i);
        if (menuItem != null && (A002 = this.A0A.A00(i)) != null) {
            menuItem.setTitle(C107345b9.A05(this.A04.getBaseContext(), this.A0C, A002.BDk(this)));
        }
    }

    public void BQw(AnonymousClass0R2 r5) {
        if (this instanceof AnonymousClass685) {
            AnonymousClass685 r2 = (AnonymousClass685) this;
            switch (r2.A01) {
                case 0:
                    Log.i("MediaAlbumActivity/onDestroyActionMode");
                    break;
                case 1:
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append(((C93544ok) r2.A00).A76());
                    C18260x0.A1L(A0o, "/selectionended");
                    break;
                case 2:
                    C162457s7.A0J(r5, 0);
                    break;
                case 3:
                    break;
                case 4:
                    MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) r2.A00;
                    AnonymousClass5QO r1 = mediaGalleryActivity.A0I;
                    if (r1 != null) {
                        r1.A01();
                        mediaGalleryActivity.A0I = null;
                    }
                    mediaGalleryActivity.A06 = null;
                    Iterator A4M = C89654ea.A4M(mediaGalleryActivity);
                    while (A4M.hasNext()) {
                        C08310eF A0D2 = AnonymousClass4L0.A0D(A4M);
                        if (A0D2 instanceof AnonymousClass665) {
                            ((AnonymousClass665) A0D2).BbA();
                        }
                    }
                    return;
                case 5:
                    MyStatusesActivity myStatusesActivity = (MyStatusesActivity) r2.A00;
                    Set set = myStatusesActivity.A12;
                    set.clear();
                    Map map = myStatusesActivity.A11;
                    set.addAll(map.keySet());
                    C86644Kx.A0s(myStatusesActivity.A0p, myStatusesActivity.A0w);
                    map.clear();
                    myStatusesActivity.A01 = null;
                    myStatusesActivity.A0Z.notifyDataSetChanged();
                    return;
                default:
                    StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) r2.A00;
                    AnonymousClass5QO r12 = storageUsageGalleryActivity.A0E;
                    if (r12 != null) {
                        r12.A01();
                        storageUsageGalleryActivity.A0E = null;
                    }
                    storageUsageGalleryActivity.A06 = null;
                    StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = storageUsageGalleryActivity.A0P;
                    if (storageUsageMediaGalleryFragment != null && storageUsageMediaGalleryFragment.A16()) {
                        storageUsageMediaGalleryFragment.A1P();
                        return;
                    }
                    return;
            }
            Log.i("conversation/selectionended");
            r2.A00();
            return;
        }
        Log.i("conversation/selectionended");
    }

    public Context getContext() {
        return this.A03;
    }

    public C113145kx(C89644eZ r2, C64773Ex r3, AnonymousClass5ZU r4, AnonymousClass5RO r5, AnonymousClass655 r6, C104555Rk r7, C620733j r8, AnonymousClass5Y0 r9) {
        C18260x0.A0e(r9, r3, r4, r8);
        C162457s7.A0J(r7, 8);
        this.A04 = r2;
        this.A0C = r9;
        this.A05 = r3;
        this.A06 = r4;
        this.A0B = r8;
        this.A09 = r6;
        this.A08 = r5;
        this.A0A = r7;
        this.A03 = r2;
    }

    public String B77() {
        C624134x r1;
        UserJid A002;
        Collection BCf = BCf();
        if (BCf == null || BCf.isEmpty()) {
            r1 = null;
        } else {
            r1 = C18300x5.A0T(BCf.iterator());
        }
        if (r1 == null || (A002 = C66493Lq.A00(r1)) == null) {
            return null;
        }
        return C18300x5.A0h(this.A06, this.A05.A0A(A002));
    }
}
