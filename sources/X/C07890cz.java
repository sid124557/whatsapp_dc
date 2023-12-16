package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0cz  reason: invalid class name and case insensitive filesystem */
public class C07890cz implements C17220vA {
    public static final int[] A0P = {1, 4, 5, 3, 2, 0};
    public int A00 = 0;
    public Drawable A01;
    public View A02;
    public C16460tR A03;
    public C07910d1 A04;
    public CharSequence A05;
    public ArrayList A06;
    public ArrayList A07;
    public ArrayList A08;
    public ArrayList A09 = AnonymousClass001.A0s();
    public ArrayList A0A;
    public CopyOnWriteArrayList A0B = new CopyOnWriteArrayList();
    public boolean A0C = false;
    public boolean A0D;
    public boolean A0E = false;
    public boolean A0F;
    public boolean A0G = false;
    public boolean A0H = false;
    public boolean A0I;
    public boolean A0J = false;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M = false;
    public final Context A0N;
    public final Resources A0O;

    public void A07() {
        this.A0J = false;
        if (this.A0G) {
            this.A0G = false;
            A0F(this.A0M);
        }
    }

    public void clearHeader() {
        this.A01 = null;
        this.A05 = null;
        this.A02 = null;
        A0F(false);
    }

    public void close() {
        A0G(true);
    }

    public void removeGroup(int i) {
        int i2 = 0;
        int size = size();
        while (i2 < size) {
            ArrayList arrayList = this.A07;
            if (AnonymousClass001.A0V(arrayList, i2).getGroupId() != i) {
                i2++;
            } else if (i2 >= 0) {
                int size2 = arrayList.size() - i2;
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    if (i3 >= size2 || AnonymousClass001.A0V(arrayList, i2).getGroupId() != i) {
                        A0F(true);
                    } else {
                        if (i2 < arrayList.size()) {
                            arrayList.remove(i2);
                        }
                        i3 = i4;
                    }
                }
                A0F(true);
                return;
            } else {
                return;
            }
        }
    }

    public static void A00(C07910d1 r1) {
        r1.A0E.A0F(false);
    }

    public MenuItem A01(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = i3;
        int i6 = (-65536 & i3) >> 16;
        if (i6 >= 0) {
            int[] iArr = A0P;
            if (i6 < iArr.length) {
                int i7 = (i3 & 65535) | (iArr[i6] << 16);
                C07910d1 r3 = new C07910d1(this, charSequence, i, i2, i5, i7, this.A00);
                ArrayList arrayList = this.A07;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (AnonymousClass001.A0V(arrayList, size).A0S <= i7) {
                            i4 = size + 1;
                            break;
                        }
                    } else {
                        i4 = 0;
                        break;
                    }
                }
                arrayList.add(i4, r3);
                A0F(true);
                return r3;
            }
        }
        throw AnonymousClass001.A0c("order does not contain a valid category.");
    }

    public C07890cz A02() {
        return this;
    }

    public C07910d1 A03(KeyEvent keyEvent, int i) {
        char numericShortcut;
        ArrayList arrayList = this.A09;
        arrayList.clear();
        A0C(keyEvent, arrayList, i);
        if (!arrayList.isEmpty()) {
            int metaState = keyEvent.getMetaState();
            KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
            keyEvent.getKeyData(keyData);
            int size = arrayList.size();
            if (size == 1) {
                return AnonymousClass001.A0V(arrayList, 0);
            }
            boolean A0I2 = A0I();
            for (int i2 = 0; i2 < size; i2++) {
                C07910d1 A0V = AnonymousClass001.A0V(arrayList, i2);
                if (A0I2) {
                    numericShortcut = A0V.getAlphabeticShortcut();
                } else {
                    numericShortcut = A0V.getNumericShortcut();
                }
                char[] cArr = keyData.meta;
                if ((numericShortcut == cArr[0] && (metaState & 2) == 0) || ((numericShortcut == cArr[2] && (metaState & 2) != 0) || (A0I2 && numericShortcut == 8 && i == 67))) {
                    return A0V;
                }
            }
        }
        return null;
    }

    public String A04() {
        return "android:menu:actionviewstates";
    }

    public ArrayList A05() {
        if (this.A0F) {
            ArrayList arrayList = this.A0A;
            arrayList.clear();
            ArrayList arrayList2 = this.A07;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                C07910d1 A0V = AnonymousClass001.A0V(arrayList2, i);
                if (A0V.isVisible()) {
                    arrayList.add(A0V);
                }
            }
            this.A0F = false;
            this.A0D = true;
        }
        return this.A0A;
    }

    public void A08() {
        if (!this.A0J) {
            this.A0J = true;
            this.A0G = false;
            this.A0M = false;
        }
    }

    public void A09(Context context, C17050uU r4) {
        this.A0B.add(new WeakReference(r4));
        r4.BG6(context, this);
        this.A0D = true;
    }

    public void A0C(KeyEvent keyEvent, List list, int i) {
        char numericShortcut;
        int numericModifiers;
        boolean A0I2 = A0I();
        KeyEvent keyEvent2 = keyEvent;
        int modifiers = keyEvent2.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        int i2 = i;
        if (keyEvent2.getKeyData(keyData) || i2 == 67) {
            ArrayList arrayList = this.A07;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                C07910d1 A0V = AnonymousClass001.A0V(arrayList, i3);
                List list2 = list;
                if (A0V.hasSubMenu()) {
                    ((C07890cz) A0V.getSubMenu()).A0C(keyEvent2, list2, i2);
                }
                if (A0I2) {
                    numericShortcut = A0V.getAlphabeticShortcut();
                    numericModifiers = A0V.getAlphabeticModifiers();
                } else {
                    numericShortcut = A0V.getNumericShortcut();
                    numericModifiers = A0V.getNumericModifiers();
                }
                if ((modifiers & 69647) == (numericModifiers & 69647) && numericShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((numericShortcut == cArr[0] || numericShortcut == cArr[2] || (A0I2 && numericShortcut == 8 && i2 == 67)) && A0V.isEnabled()) {
                        list2.add(A0V);
                    }
                }
            }
        }
    }

    public void A0E(C17050uU r5) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A0B;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            Object obj = reference.get();
            if (obj == null || obj == r5) {
                copyOnWriteArrayList.remove(reference);
            }
        }
    }

    public void A0F(boolean z) {
        if (!this.A0J) {
            if (z) {
                this.A0F = true;
                this.A0D = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.A0B;
            if (!copyOnWriteArrayList.isEmpty()) {
                A08();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    Reference reference = (Reference) it.next();
                    C17050uU r0 = (C17050uU) reference.get();
                    if (r0 == null) {
                        copyOnWriteArrayList.remove(reference);
                    } else {
                        r0.Brl(z);
                    }
                }
                A07();
                return;
            }
            return;
        }
        this.A0G = true;
        if (z) {
            this.A0M = true;
        }
    }

    public final void A0G(boolean z) {
        if (!this.A0E) {
            this.A0E = true;
            CopyOnWriteArrayList copyOnWriteArrayList = this.A0B;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                C17050uU r0 = (C17050uU) reference.get();
                if (r0 == null) {
                    copyOnWriteArrayList.remove(reference);
                } else {
                    r0.BPH(this, z);
                }
            }
            this.A0E = false;
        }
    }

    public boolean A0H() {
        return this.A0C;
    }

    public boolean A0I() {
        return this.A0K;
    }

    public boolean A0J() {
        return this.A0L;
    }

    public boolean A0K(MenuItem menuItem, C07890cz r4) {
        C16460tR r0 = this.A03;
        if (r0 == null || !r0.BWQ(menuItem, r4)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (((X.AnonymousClass067) r4).A00.hasSubMenu() == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r7 != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0043, code lost:
        if ((r11 & 1) == 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a4, code lost:
        if (r7 == false) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(android.view.MenuItem r9, X.C17050uU r10, int r11) {
        /*
            r8 = this;
            X.0d1 r9 = (X.C07910d1) r9
            r3 = 0
            if (r9 == 0) goto L_0x00d5
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x00d5
            android.view.MenuItem$OnMenuItemClickListener r0 = r9.A0C
            if (r0 == 0) goto L_0x00a7
            boolean r0 = r0.onMenuItemClick(r9)
            if (r0 == 0) goto L_0x00a7
        L_0x0015:
            r7 = 1
        L_0x0016:
            X.0L5 r4 = r9.A0G
            r6 = 1
            if (r4 == 0) goto L_0x0027
            r0 = r4
            X.067 r0 = (X.AnonymousClass067) r0
            android.view.ActionProvider r0 = r0.A00
            boolean r0 = r0.hasSubMenu()
            r2 = 1
            if (r0 != 0) goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            boolean r0 = r9.A01()
            if (r0 == 0) goto L_0x0039
            boolean r0 = r9.expandActionView()
            r7 = r7 | r0
            if (r7 == 0) goto L_0x0038
        L_0x0035:
            r8.A0G(r6)
        L_0x0038:
            return r7
        L_0x0039:
            boolean r0 = r9.hasSubMenu()
            if (r0 != 0) goto L_0x0046
            if (r2 != 0) goto L_0x0046
            r0 = r11 & 1
            if (r0 != 0) goto L_0x0038
            goto L_0x0035
        L_0x0046:
            r0 = r11 & 4
            if (r0 != 0) goto L_0x004d
            r8.A0G(r3)
        L_0x004d:
            boolean r0 = r9.hasSubMenu()
            if (r0 != 0) goto L_0x0063
            android.content.Context r0 = r8.A0N
            X.04J r1 = new X.04J
            r1.<init>(r0, r8, r9)
            r9.A0F = r1
            java.lang.CharSequence r0 = r9.getTitle()
            r1.setHeaderTitle((java.lang.CharSequence) r0)
        L_0x0063:
            android.view.SubMenu r5 = r9.getSubMenu()
            X.04J r5 = (X.AnonymousClass04J) r5
            if (r2 == 0) goto L_0x0072
            X.067 r4 = (X.AnonymousClass067) r4
            android.view.ActionProvider r0 = r4.A00
            r0.onPrepareSubMenu(r5)
        L_0x0072:
            java.util.concurrent.CopyOnWriteArrayList r4 = r8.A0B
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00a3
            if (r10 == 0) goto L_0x0080
            boolean r3 = r10.Bcv(r5)
        L_0x0080:
            java.util.Iterator r2 = r4.iterator()
        L_0x0084:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r1 = r2.next()
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            java.lang.Object r0 = r1.get()
            X.0uU r0 = (X.C17050uU) r0
            if (r0 != 0) goto L_0x009c
            r4.remove(r1)
            goto L_0x0084
        L_0x009c:
            if (r3 != 0) goto L_0x0084
            boolean r3 = r0.Bcv(r5)
            goto L_0x0084
        L_0x00a3:
            r7 = r7 | r3
            if (r7 != 0) goto L_0x0038
            goto L_0x0035
        L_0x00a7:
            X.0cz r2 = r9.A0E
            boolean r0 = r2.A0K(r9, r2)
            if (r0 != 0) goto L_0x0015
            android.content.Intent r1 = r9.A07
            if (r1 == 0) goto L_0x00c2
            android.content.Context r0 = r2.A0N     // Catch:{ ActivityNotFoundException -> 0x00ba }
            r0.startActivity(r1)     // Catch:{ ActivityNotFoundException -> 0x00ba }
            goto L_0x0015
        L_0x00ba:
            r2 = move-exception
            java.lang.String r1 = "MenuItemImpl"
            java.lang.String r0 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r1, r0, r2)
        L_0x00c2:
            X.0L5 r0 = r9.A0G
            if (r0 == 0) goto L_0x00d2
            X.067 r0 = (X.AnonymousClass067) r0
            android.view.ActionProvider r0 = r0.A00
            boolean r0 = r0.onPerformDefaultAction()
            if (r0 == 0) goto L_0x00d2
            goto L_0x0015
        L_0x00d2:
            r7 = 0
            goto L_0x0016
        L_0x00d5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07890cz.A0L(android.view.MenuItem, X.0uU, int):boolean");
    }

    public boolean A0M(C07910d1 r6) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A0B;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.A04 == r6) {
            A08();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                C17050uU r0 = (C17050uU) reference.get();
                if (r0 == null) {
                    copyOnWriteArrayList.remove(reference);
                } else {
                    z = r0.Az7(this, r6);
                    if (z) {
                        break;
                    }
                }
            }
            A07();
            if (z) {
                this.A04 = null;
            }
        }
        return z;
    }

    public boolean A0N(C07910d1 r6) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A0B;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty()) {
            A08();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                C17050uU r0 = (C17050uU) reference.get();
                if (r0 == null) {
                    copyOnWriteArrayList.remove(reference);
                } else {
                    z = r0.B2v(this, r6);
                    if (z) {
                        break;
                    }
                }
            }
            A07();
            if (z) {
                this.A04 = r6;
            }
        }
        return z;
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return A01(i, i2, i3, this.A0O.getString(i4));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        int i6;
        PackageManager packageManager = this.A0N.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            if (i8 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i8];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent4;
            }
        }
        return i5;
    }

    public void clear() {
        C07910d1 r0 = this.A04;
        if (r0 != null) {
            A0M(r0);
        }
        this.A07.clear();
        A0F(true);
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.A07.get(i);
    }

    public boolean hasVisibleItems() {
        if (!this.A0I) {
            int size = size();
            int i = 0;
            while (i < size) {
                if (!AnonymousClass001.A0V(this.A07, i).isVisible()) {
                    i++;
                }
            }
            return false;
        }
        return true;
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.A07;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C07910d1 A0V = AnonymousClass001.A0V(arrayList, i2);
            if (A0V.getGroupId() == i) {
                int i3 = A0V.A02 & -5;
                int i4 = 0;
                if (z2) {
                    i4 = 4;
                }
                A0V.A02 = i4 | i3;
                A0V.setCheckable(z);
            }
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.A07;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C07910d1 A0V = AnonymousClass001.A0V(arrayList, i2);
            if (A0V.getGroupId() == i) {
                A0V.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.A07;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C07910d1 A0V = AnonymousClass001.A0V(arrayList, i2);
            if (A0V.getGroupId() == i) {
                int i3 = A0V.A02;
                int A082 = AnonymousClass001.A08(z ? 1 : 0) | (i3 & -9);
                A0V.A02 = A082;
                if (i3 != A082) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            A0F(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.A0K = z;
        A0F(false);
    }

    public int size() {
        return this.A07.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0057, code lost:
        if (X.C06500Xy.A04(r1, android.view.ViewConfiguration.get(r1)) != false) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C07890cz(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            r1 = 0
            r3.A00 = r1
            r3.A0J = r1
            r3.A0G = r1
            r3.A0M = r1
            r3.A0H = r1
            r3.A0E = r1
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r3.A09 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r3.A0B = r0
            r3.A0C = r1
            r3.A0N = r4
            android.content.res.Resources r2 = r4.getResources()
            r3.A0O = r2
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r3.A07 = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r3.A0A = r0
            r1 = 1
            r3.A0F = r1
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r3.A06 = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r3.A08 = r0
            r3.A0D = r1
            android.content.res.Configuration r0 = r2.getConfiguration()
            int r0 = r0.keyboard
            r2 = 1
            if (r0 == r1) goto L_0x005c
            android.content.Context r1 = r3.A0N
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r1)
            boolean r0 = X.C06500Xy.A04(r1, r0)
            if (r0 == 0) goto L_0x005c
        L_0x0059:
            r3.A0L = r2
            return
        L_0x005c:
            r2 = 0
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07890cz.<init>(android.content.Context):void");
    }

    public void A06() {
        ArrayList A052 = A05();
        if (this.A0D) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.A0B;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                C17050uU r0 = (C17050uU) reference.get();
                if (r0 == null) {
                    copyOnWriteArrayList.remove(reference);
                } else {
                    z |= r0.B3N();
                }
            }
            if (z) {
                ArrayList arrayList = this.A06;
                arrayList.clear();
                ArrayList arrayList2 = this.A08;
                arrayList2.clear();
                int size = A052.size();
                for (int i = 0; i < size; i++) {
                    C07910d1 A0V = AnonymousClass001.A0V(A052, i);
                    ArrayList arrayList3 = arrayList2;
                    if ((A0V.A02 & 32) == 32) {
                        arrayList3 = arrayList;
                    }
                    arrayList3.add(A0V);
                }
            } else {
                this.A06.clear();
                ArrayList arrayList4 = this.A08;
                arrayList4.clear();
                arrayList4.addAll(A05());
            }
            this.A0D = false;
        }
    }

    public void A0A(Bundle bundle) {
        MenuItem findItem;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(A04());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((C07890cz) item.getSubMenu()).A0A(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 > 0 && (findItem = findItem(i2)) != null) {
            findItem.expandActionView();
        }
    }

    public void A0B(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C07890cz) item.getSubMenu()).A0B(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(A04(), sparseArray);
        }
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C07910d1 r2 = (C07910d1) A01(i, i2, i3, charSequence);
        AnonymousClass04J r1 = new AnonymousClass04J(this.A0N, this, r2);
        r2.A0F = r1;
        r1.setHeaderTitle(r2.getTitle());
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        r1 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.MenuItem findItem(int r5) {
        /*
            r4 = this;
            int r3 = r4.size()
            r2 = 0
        L_0x0005:
            if (r2 >= r3) goto L_0x0027
            java.util.ArrayList r0 = r4.A07
            X.0d1 r1 = X.AnonymousClass001.A0V(r0, r2)
            int r0 = r1.getItemId()
            if (r0 == r5) goto L_0x0023
            boolean r0 = r1.hasSubMenu()
            if (r0 == 0) goto L_0x0024
            android.view.SubMenu r0 = r1.getSubMenu()
            android.view.MenuItem r1 = r0.findItem(r5)
            if (r1 == 0) goto L_0x0024
        L_0x0023:
            return r1
        L_0x0024:
            int r2 = r2 + 1
            goto L_0x0005
        L_0x0027:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07890cz.findItem(int):android.view.MenuItem");
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return AnonymousClass000.A1W(A03(keyEvent, i));
    }

    public boolean performIdentifierAction(int i, int i2) {
        return A0L(findItem(i), (C17050uU) null, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        C07910d1 A032 = A03(keyEvent, i);
        if (A032 != null) {
            z = A0L(A032, (C17050uU) null, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            A0G(true);
        }
        return z;
    }

    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (i2 < size) {
            ArrayList arrayList = this.A07;
            if (AnonymousClass001.A0V(arrayList, i2).getItemId() != i) {
                i2++;
            } else if (i2 >= 0 && i2 < arrayList.size()) {
                arrayList.remove(i2);
                A0F(true);
                return;
            } else {
                return;
            }
        }
    }

    public void A0D(C16460tR r1) {
        this.A03 = r1;
    }

    public void setGroupDividerEnabled(boolean z) {
        this.A0C = z;
    }

    public MenuItem add(int i) {
        return A01(0, 0, 0, this.A0O.getString(i));
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.A0O.getString(i));
    }

    public MenuItem add(CharSequence charSequence) {
        return A01(0, 0, 0, charSequence);
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return A01(i, i2, i3, charSequence);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.A0O.getString(i4));
    }
}
