package X;

import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.0WE  reason: invalid class name */
public class AnonymousClass0WE {
    public int A00 = -1;
    public boolean A01 = false;
    public final C08310eF A02;
    public final AnonymousClass0R3 A03;
    public final C04760Qo A04;

    public void A02() {
        int i;
        View view;
        View view2;
        C04760Qo r0 = this.A04;
        C08310eF r6 = this.A02;
        ViewGroup viewGroup = r6.A0C;
        if (viewGroup != null) {
            ArrayList arrayList = r0.A01;
            int indexOf = arrayList.indexOf(r6);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        C08310eF r1 = (C08310eF) arrayList.get(indexOf);
                        if (r1.A0C == viewGroup && (view = r1.A0B) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    C08310eF r12 = (C08310eF) arrayList.get(i2);
                    if (r12.A0C == viewGroup && (view2 = r12.A0B) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
            r6.A0C.addView(r6.A0B, i);
        }
        i = -1;
        r6.A0C.addView(r6.A0B, i);
    }

    public void A03() {
        C08310eF r5 = this.A02;
        if (r5.A0a && r5.A0e && !r5.A0h) {
            if (C08270df.A05(3)) {
                Log.d("FragmentManager", AnonymousClass000.A0P(r5, "moveto CREATE_VIEW: ", AnonymousClass001.A0o()));
            }
            LayoutInflater A1E = r5.A1E(r5.A07);
            r5.A0A = A1E;
            r5.A0v(r5.A07, A1E, (ViewGroup) null);
            View view = r5.A0B;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                r5.A0B.setTag(R.id.fragment_container_view_tag, r5);
                if (r5.A0c) {
                    r5.A0B.setVisibility(8);
                }
                r5.A0w(r5.A07, r5.A0B);
                r5.A0H.A0S(2);
                this.A03.A00(r5.A07, r5.A0B, r5, false);
                r5.A04 = 2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03c6, code lost:
        r4.A04 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x043b, code lost:
        r4.A04 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0456, code lost:
        if (r4.A00 > 0) goto L_0x0458;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x061a, code lost:
        r4.A04 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0039, code lost:
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089 A[Catch:{ all -> 0x0900 }, LOOP:1: B:27:0x0083->B:29:0x0089, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d2 A[Catch:{ all -> 0x0900 }] */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x0785 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r15 = this;
            boolean r0 = r15.A01
            r8 = 2
            java.lang.String r7 = "FragmentManager"
            if (r0 == 0) goto L_0x0020
            boolean r0 = X.C08270df.A05(r8)
            if (r0 == 0) goto L_0x001f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Ignoring re-entrant call to moveToExpectedState() for "
            r1.append(r0)
            X.0eF r0 = r15.A02
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)
            android.util.Log.v(r7, r0)
        L_0x001f:
            return
        L_0x0020:
            r2 = 0
            r6 = 1
            r15.A01 = r6     // Catch:{ all -> 0x0900 }
            r14 = 0
        L_0x0025:
            X.0eF r4 = r15.A02     // Catch:{ all -> 0x0900 }
            X.0df r0 = r4.A0I     // Catch:{ all -> 0x0900 }
            if (r0 != 0) goto L_0x068d
            int r3 = r4.A04     // Catch:{ all -> 0x0900 }
        L_0x002d:
            int r1 = r4.A04     // Catch:{ all -> 0x0900 }
            r9 = 3
            if (r3 == r1) goto L_0x084f
            if (r3 <= r1) goto L_0x03be
            int r0 = r1 + 1
            switch(r0) {
                case 0: goto L_0x003b;
                case 1: goto L_0x0373;
                case 2: goto L_0x012f;
                case 3: goto L_0x02f4;
                case 4: goto L_0x00ff;
                case 5: goto L_0x02a8;
                case 6: goto L_0x00fc;
                case 7: goto L_0x01f7;
                default: goto L_0x0039;
            }     // Catch:{ all -> 0x0900 }
        L_0x0039:
            r14 = 1
            goto L_0x0025
        L_0x003b:
            boolean r0 = X.C08270df.A05(r9)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x004a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "moveto ATTACHED: "
            X.AnonymousClass000.A19(r4, r0, r7, r1)     // Catch:{ all -> 0x0900 }
        L_0x004a:
            X.0eF r1 = r4.A0F     // Catch:{ all -> 0x0900 }
            java.lang.String r3 = " that does not belong to this FragmentManager!"
            java.lang.String r5 = " declared target fragment "
            java.lang.String r9 = "Fragment "
            r10 = 0
            if (r1 == 0) goto L_0x0093
            X.0Qo r0 = r15.A04     // Catch:{ all -> 0x0900 }
            java.lang.String r1 = r1.A0V     // Catch:{ all -> 0x0900 }
            java.util.HashMap r0 = r0.A02     // Catch:{ all -> 0x0900 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0900 }
            X.0WE r1 = (X.AnonymousClass0WE) r1     // Catch:{ all -> 0x0900 }
            if (r1 == 0) goto L_0x0791
            X.0eF r0 = r4.A0F     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = r0.A0V     // Catch:{ all -> 0x0900 }
            r4.A0U = r0     // Catch:{ all -> 0x0900 }
            r4.A0F = r10     // Catch:{ all -> 0x0900 }
        L_0x006b:
            r1.A04()     // Catch:{ all -> 0x0900 }
        L_0x006e:
            X.0df r1 = r4.A0I     // Catch:{ all -> 0x0900 }
            X.07u r0 = r1.A07     // Catch:{ all -> 0x0900 }
            r4.A0G = r0     // Catch:{ all -> 0x0900 }
            X.0eF r0 = r1.A05     // Catch:{ all -> 0x0900 }
            r4.A0E = r0     // Catch:{ all -> 0x0900 }
            X.0R3 r5 = r15.A03     // Catch:{ all -> 0x0900 }
            r5.A07(r4)     // Catch:{ all -> 0x0900 }
            java.util.ArrayList r3 = r4.A0n     // Catch:{ all -> 0x0900 }
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x0900 }
        L_0x0083:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0900 }
            X.0Mt r0 = (X.C04090Mt) r0     // Catch:{ all -> 0x0900 }
            r0.A00()     // Catch:{ all -> 0x0900 }
            goto L_0x0083
        L_0x0093:
            java.lang.String r1 = r4.A0U     // Catch:{ all -> 0x0900 }
            if (r1 == 0) goto L_0x006e
            X.0Qo r0 = r15.A04     // Catch:{ all -> 0x0900 }
            java.util.HashMap r0 = r0.A02     // Catch:{ all -> 0x0900 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0900 }
            X.0WE r1 = (X.AnonymousClass0WE) r1     // Catch:{ all -> 0x0900 }
            if (r1 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0k(r4, r9)     // Catch:{ all -> 0x0900 }
            r1.append(r5)     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = r4.A0U     // Catch:{ all -> 0x0900 }
            r1.append(r0)     // Catch:{ all -> 0x0900 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r3, r1)     // Catch:{ all -> 0x0900 }
            goto L_0x084e
        L_0x00b5:
            r3.clear()     // Catch:{ all -> 0x0900 }
            X.0df r3 = r4.A0H     // Catch:{ all -> 0x0900 }
            X.07u r1 = r4.A0G     // Catch:{ all -> 0x0900 }
            X.0O3 r0 = r4.A0S()     // Catch:{ all -> 0x0900 }
            r3.A0e(r4, r1, r0)     // Catch:{ all -> 0x0900 }
            r4.A04 = r2     // Catch:{ all -> 0x0900 }
            r4.A0X = r2     // Catch:{ all -> 0x0900 }
            X.07u r0 = r4.A0G     // Catch:{ all -> 0x0900 }
            android.content.Context r0 = r0.A01     // Catch:{ all -> 0x0900 }
            r4.A1G(r0)     // Catch:{ all -> 0x0900 }
            boolean r0 = r4.A0X     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0785
            X.0df r3 = r4.A0I     // Catch:{ all -> 0x0900 }
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.A0d     // Catch:{ all -> 0x0900 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0900 }
        L_0x00da:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0900 }
            X.0s8 r0 = (X.C15890s8) r0     // Catch:{ all -> 0x0900 }
            r0.BMj(r4, r3)     // Catch:{ all -> 0x0900 }
            goto L_0x00da
        L_0x00ea:
            X.0df r1 = r4.A0H     // Catch:{ all -> 0x0900 }
            r1.A0O = r2     // Catch:{ all -> 0x0900 }
            r1.A0P = r2     // Catch:{ all -> 0x0900 }
            X.08T r0 = r1.A0A     // Catch:{ all -> 0x0900 }
            r0.A01 = r2     // Catch:{ all -> 0x0900 }
            r1.A0S(r2)     // Catch:{ all -> 0x0900 }
            r5.A05(r4)     // Catch:{ all -> 0x0900 }
            goto L_0x0039
        L_0x00fc:
            r0 = 6
            goto L_0x03c6
        L_0x00ff:
            android.view.View r0 = r4.A0B     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x012c
            android.view.ViewGroup r0 = r4.A0C     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x012c
            r4.A0U()     // Catch:{ all -> 0x0900 }
            X.0UN r5 = X.AnonymousClass0UN.A01(r0)     // Catch:{ all -> 0x0900 }
            android.view.View r0 = r4.A0B     // Catch:{ all -> 0x0900 }
            int r0 = r0.getVisibility()     // Catch:{ all -> 0x0900 }
            X.0GJ r3 = X.AnonymousClass0GJ.A00(r0)     // Catch:{ all -> 0x0900 }
            boolean r0 = X.C08270df.A05(r8)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0127
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "SpecialEffectsController: Enqueuing add operation for fragment "
            X.AnonymousClass000.A18(r4, r0, r7, r1)     // Catch:{ all -> 0x0900 }
        L_0x0127:
            X.0Fc r0 = X.C02160Fc.ADDING     // Catch:{ all -> 0x0900 }
            r5.A06(r15, r0, r3)     // Catch:{ all -> 0x0900 }
        L_0x012c:
            r0 = 4
            goto L_0x03c6
        L_0x012f:
            r15.A03()     // Catch:{ all -> 0x0900 }
            boolean r0 = r4.A0a     // Catch:{ all -> 0x0900 }
            if (r0 != 0) goto L_0x0039
            boolean r0 = X.C08270df.A05(r9)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0145
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "moveto CREATE_VIEW: "
            X.AnonymousClass000.A19(r4, r0, r7, r1)     // Catch:{ all -> 0x0900 }
        L_0x0145:
            android.os.Bundle r0 = r4.A07     // Catch:{ all -> 0x0900 }
            android.view.LayoutInflater r11 = r4.A1E(r0)     // Catch:{ all -> 0x0900 }
            r4.A0A = r11     // Catch:{ all -> 0x0900 }
            android.view.ViewGroup r10 = r4.A0C     // Catch:{ all -> 0x0900 }
            if (r10 != 0) goto L_0x018b
            int r1 = r4.A01     // Catch:{ all -> 0x0900 }
            if (r1 == 0) goto L_0x016a
            r0 = -1
            if (r1 == r0) goto L_0x07ce
            X.0df r0 = r4.A0I     // Catch:{ all -> 0x0900 }
            X.0O3 r0 = r0.A08     // Catch:{ all -> 0x0900 }
            android.view.View r10 = r0.A00(r1)     // Catch:{ all -> 0x0900 }
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10     // Catch:{ all -> 0x0900 }
            if (r10 != 0) goto L_0x016c
            boolean r0 = r4.A0j     // Catch:{ all -> 0x0900 }
            if (r0 != 0) goto L_0x018b
            goto L_0x07a3
        L_0x016a:
            r10 = 0
            goto L_0x018b
        L_0x016c:
            boolean r0 = r10 instanceof androidx.fragment.app.FragmentContainerView     // Catch:{ all -> 0x0900 }
            if (r0 != 0) goto L_0x018b
            X.086 r9 = new X.086     // Catch:{ all -> 0x0900 }
            r9.<init>(r10, r4)     // Catch:{ all -> 0x0900 }
            X.0Y2 r5 = X.AnonymousClass0Y2.A01     // Catch:{ all -> 0x0900 }
            X.AnonymousClass0Y2.A03(r9)     // Catch:{ all -> 0x0900 }
            X.0T5 r3 = X.AnonymousClass0Y2.A00(r4)     // Catch:{ all -> 0x0900 }
            java.util.Set r1 = r3.A01     // Catch:{ all -> 0x0900 }
            X.0G2 r0 = X.AnonymousClass0G2.DETECT_WRONG_FRAGMENT_CONTAINER     // Catch:{ all -> 0x0900 }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x018b
            X.AnonymousClass000.A0y(r3, r5, r9, r4)     // Catch:{ all -> 0x0900 }
        L_0x018b:
            r4.A0C = r10     // Catch:{ all -> 0x0900 }
            android.os.Bundle r0 = r4.A07     // Catch:{ all -> 0x0900 }
            r4.A0v(r0, r11, r10)     // Catch:{ all -> 0x0900 }
            android.view.View r0 = r4.A0B     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x043b
            r0.setSaveFromParentEnabled(r2)     // Catch:{ all -> 0x0900 }
            android.view.View r1 = r4.A0B     // Catch:{ all -> 0x0900 }
            r0 = 2131430251(0x7f0b0b6b, float:1.8482198E38)
            r1.setTag(r0, r4)     // Catch:{ all -> 0x0900 }
            if (r10 == 0) goto L_0x01a6
            r15.A02()     // Catch:{ all -> 0x0900 }
        L_0x01a6:
            boolean r0 = r4.A0c     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x01b1
            android.view.View r1 = r4.A0B     // Catch:{ all -> 0x0900 }
            r0 = 8
            r1.setVisibility(r0)     // Catch:{ all -> 0x0900 }
        L_0x01b1:
            android.view.View r0 = r4.A0B     // Catch:{ all -> 0x0900 }
            boolean r0 = X.C06360Xi.A04(r0)     // Catch:{ all -> 0x0900 }
            android.view.View r1 = r4.A0B     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x01ea
            X.AnonymousClass0V0.A02(r1)     // Catch:{ all -> 0x0900 }
        L_0x01be:
            android.view.View r1 = r4.A0B     // Catch:{ all -> 0x0900 }
            android.os.Bundle r0 = r4.A07     // Catch:{ all -> 0x0900 }
            r4.A0w(r0, r1)     // Catch:{ all -> 0x0900 }
            X.0df r0 = r4.A0H     // Catch:{ all -> 0x0900 }
            r0.A0S(r8)     // Catch:{ all -> 0x0900 }
            X.0R3 r3 = r15.A03     // Catch:{ all -> 0x0900 }
            android.view.View r1 = r4.A0B     // Catch:{ all -> 0x0900 }
            android.os.Bundle r0 = r4.A07     // Catch:{ all -> 0x0900 }
            r3.A00(r0, r1, r4, r2)     // Catch:{ all -> 0x0900 }
            android.view.View r0 = r4.A0B     // Catch:{ all -> 0x0900 }
            int r3 = r0.getVisibility()     // Catch:{ all -> 0x0900 }
            android.view.View r0 = r4.A0B     // Catch:{ all -> 0x0900 }
            float r1 = r0.getAlpha()     // Catch:{ all -> 0x0900 }
            X.0Mp r0 = r4.A0M()     // Catch:{ all -> 0x0900 }
            r0.A00 = r1     // Catch:{ all -> 0x0900 }
            android.view.ViewGroup r0 = r4.A0C     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x043b
            goto L_0x01f3
        L_0x01ea:
            X.0wA r0 = new X.0wA     // Catch:{ all -> 0x0900 }
            r0.<init>(r1, r6, r15)     // Catch:{ all -> 0x0900 }
            r1.addOnAttachStateChangeListener(r0)     // Catch:{ all -> 0x0900 }
            goto L_0x01be
        L_0x01f3:
            if (r3 != 0) goto L_0x043b
            goto L_0x0410
        L_0x01f7:
            boolean r0 = X.C08270df.A05(r9)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0206
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "moveto RESUMED: "
            X.AnonymousClass000.A19(r4, r0, r7, r1)     // Catch:{ all -> 0x0900 }
        L_0x0206:
            X.0Mp r0 = r4.A0D     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x025e
            android.view.View r5 = r0.A06     // Catch:{ all -> 0x0900 }
            if (r5 == 0) goto L_0x025e
            android.view.View r0 = r4.A0B     // Catch:{ all -> 0x0900 }
            if (r5 == r0) goto L_0x0221
            android.view.ViewParent r1 = r5.getParent()     // Catch:{ all -> 0x0900 }
        L_0x0216:
            if (r1 == 0) goto L_0x025e
            android.view.View r0 = r4.A0B     // Catch:{ all -> 0x0900 }
            if (r1 == r0) goto L_0x0221
            android.view.ViewParent r1 = r1.getParent()     // Catch:{ all -> 0x0900 }
            goto L_0x0216
        L_0x0221:
            boolean r3 = r5.requestFocus()     // Catch:{ all -> 0x0900 }
            boolean r0 = X.C08270df.A05(r8)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x025e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "requestFocus: Restoring focused view "
            r1.append(r0)     // Catch:{ all -> 0x0900 }
            r1.append(r5)     // Catch:{ all -> 0x0900 }
            X.AnonymousClass001.A1L(r1)     // Catch:{ all -> 0x0900 }
            if (r3 == 0) goto L_0x023f
            java.lang.String r0 = "succeeded"
            goto L_0x0241
        L_0x023f:
            java.lang.String r0 = "failed"
        L_0x0241:
            r1.append(r0)     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = " on Fragment "
            r1.append(r0)     // Catch:{ all -> 0x0900 }
            r1.append(r4)     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = " resulting in focused view "
            r1.append(r0)     // Catch:{ all -> 0x0900 }
            android.view.View r0 = r4.A0B     // Catch:{ all -> 0x0900 }
            android.view.View r0 = r0.findFocus()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)     // Catch:{ all -> 0x0900 }
            android.util.Log.v(r7, r0)     // Catch:{ all -> 0x0900 }
        L_0x025e:
            r3 = 0
            X.0Mp r0 = r4.A0M()     // Catch:{ all -> 0x0900 }
            r0.A06 = r3     // Catch:{ all -> 0x0900 }
            X.0df r0 = r4.A0H     // Catch:{ all -> 0x0900 }
            r0.A0L()     // Catch:{ all -> 0x0900 }
            X.0df r0 = r4.A0H     // Catch:{ all -> 0x0900 }
            r0.A0r(r6)     // Catch:{ all -> 0x0900 }
            r0 = 7
            r4.A04 = r0     // Catch:{ all -> 0x0900 }
            r4.A0X = r2     // Catch:{ all -> 0x0900 }
            r4.A0f()     // Catch:{ all -> 0x0900 }
            boolean r0 = r4.A0X     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x07e1
            X.08A r0 = r4.A0L     // Catch:{ all -> 0x0900 }
            X.0GH r1 = X.AnonymousClass0GH.ON_RESUME     // Catch:{ all -> 0x0900 }
            r0.A04(r1)     // Catch:{ all -> 0x0900 }
            android.view.View r0 = r4.A0B     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x028d
            X.0dn r0 = r4.A0J     // Catch:{ all -> 0x0900 }
            X.08A r0 = r0.A00     // Catch:{ all -> 0x0900 }
            r0.A04(r1)     // Catch:{ all -> 0x0900 }
        L_0x028d:
            X.0df r1 = r4.A0H     // Catch:{ all -> 0x0900 }
            r1.A0O = r2     // Catch:{ all -> 0x0900 }
            r1.A0P = r2     // Catch:{ all -> 0x0900 }
            X.08T r0 = r1.A0A     // Catch:{ all -> 0x0900 }
            r0.A01 = r2     // Catch:{ all -> 0x0900 }
            r0 = 7
            r1.A0S(r0)     // Catch:{ all -> 0x0900 }
            X.0R3 r0 = r15.A03     // Catch:{ all -> 0x0900 }
            r0.A0D(r4, r2)     // Catch:{ all -> 0x0900 }
            r4.A07 = r3     // Catch:{ all -> 0x0900 }
            r4.A09 = r3     // Catch:{ all -> 0x0900 }
            r4.A08 = r3     // Catch:{ all -> 0x0900 }
            goto L_0x0039
        L_0x02a8:
            boolean r0 = X.C08270df.A05(r9)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x02b7
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "moveto STARTED: "
            X.AnonymousClass000.A19(r4, r0, r7, r1)     // Catch:{ all -> 0x0900 }
        L_0x02b7:
            X.0df r0 = r4.A0H     // Catch:{ all -> 0x0900 }
            r0.A0L()     // Catch:{ all -> 0x0900 }
            X.0df r0 = r4.A0H     // Catch:{ all -> 0x0900 }
            r0.A0r(r6)     // Catch:{ all -> 0x0900 }
            r0 = 5
            r4.A04 = r0     // Catch:{ all -> 0x0900 }
            r4.A0X = r2     // Catch:{ all -> 0x0900 }
            r4.A0g()     // Catch:{ all -> 0x0900 }
            boolean r0 = r4.A0X     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x07ec
            X.08A r0 = r4.A0L     // Catch:{ all -> 0x0900 }
            X.0GH r1 = X.AnonymousClass0GH.ON_START     // Catch:{ all -> 0x0900 }
            r0.A04(r1)     // Catch:{ all -> 0x0900 }
            android.view.View r0 = r4.A0B     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x02df
            X.0dn r0 = r4.A0J     // Catch:{ all -> 0x0900 }
            X.08A r0 = r0.A00     // Catch:{ all -> 0x0900 }
            r0.A04(r1)     // Catch:{ all -> 0x0900 }
        L_0x02df:
            X.0df r1 = r4.A0H     // Catch:{ all -> 0x0900 }
            r1.A0O = r2     // Catch:{ all -> 0x0900 }
            r1.A0P = r2     // Catch:{ all -> 0x0900 }
            X.08T r0 = r1.A0A     // Catch:{ all -> 0x0900 }
            r0.A01 = r2     // Catch:{ all -> 0x0900 }
            r0 = 5
            r1.A0S(r0)     // Catch:{ all -> 0x0900 }
            X.0R3 r0 = r15.A03     // Catch:{ all -> 0x0900 }
            r0.A08(r4)     // Catch:{ all -> 0x0900 }
            goto L_0x0039
        L_0x02f4:
            boolean r0 = X.C08270df.A05(r9)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0303
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "moveto ACTIVITY_CREATED: "
            X.AnonymousClass000.A19(r4, r0, r7, r1)     // Catch:{ all -> 0x0900 }
        L_0x0303:
            android.os.Bundle r1 = r4.A07     // Catch:{ all -> 0x0900 }
            X.0df r0 = r4.A0H     // Catch:{ all -> 0x0900 }
            r0.A0L()     // Catch:{ all -> 0x0900 }
            r4.A04 = r9     // Catch:{ all -> 0x0900 }
            r4.A0X = r2     // Catch:{ all -> 0x0900 }
            r4.A0o(r1)     // Catch:{ all -> 0x0900 }
            boolean r0 = r4.A0X     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0802
            boolean r0 = X.C08270df.A05(r9)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0324
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "moveto RESTORE_VIEW_STATE: "
            X.AnonymousClass000.A19(r4, r0, r7, r1)     // Catch:{ all -> 0x0900 }
        L_0x0324:
            android.view.View r1 = r4.A0B     // Catch:{ all -> 0x0900 }
            if (r1 == 0) goto L_0x0359
            android.os.Bundle r5 = r4.A07     // Catch:{ all -> 0x0900 }
            android.util.SparseArray r0 = r4.A09     // Catch:{ all -> 0x0900 }
            r3 = 0
            if (r0 == 0) goto L_0x0334
            r1.restoreHierarchyState(r0)     // Catch:{ all -> 0x0900 }
            r4.A09 = r3     // Catch:{ all -> 0x0900 }
        L_0x0334:
            android.view.View r0 = r4.A0B     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0343
            X.0dn r0 = r4.A0J     // Catch:{ all -> 0x0900 }
            android.os.Bundle r1 = r4.A08     // Catch:{ all -> 0x0900 }
            X.0PU r0 = r0.A02     // Catch:{ all -> 0x0900 }
            r0.A01(r1)     // Catch:{ all -> 0x0900 }
            r4.A08 = r3     // Catch:{ all -> 0x0900 }
        L_0x0343:
            r4.A0X = r2     // Catch:{ all -> 0x0900 }
            r4.A0r(r5)     // Catch:{ all -> 0x0900 }
            boolean r0 = r4.A0X     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x07f7
            android.view.View r0 = r4.A0B     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0359
            X.0dn r0 = r4.A0J     // Catch:{ all -> 0x0900 }
            X.0GH r1 = X.AnonymousClass0GH.ON_CREATE     // Catch:{ all -> 0x0900 }
            X.08A r0 = r0.A00     // Catch:{ all -> 0x0900 }
            r0.A04(r1)     // Catch:{ all -> 0x0900 }
        L_0x0359:
            r0 = 0
            r4.A07 = r0     // Catch:{ all -> 0x0900 }
            X.0df r1 = r4.A0H     // Catch:{ all -> 0x0900 }
            r1.A0O = r2     // Catch:{ all -> 0x0900 }
            r1.A0P = r2     // Catch:{ all -> 0x0900 }
            X.08T r0 = r1.A0A     // Catch:{ all -> 0x0900 }
            r0.A01 = r2     // Catch:{ all -> 0x0900 }
            r0 = 4
            r1.A0S(r0)     // Catch:{ all -> 0x0900 }
            X.0R3 r1 = r15.A03     // Catch:{ all -> 0x0900 }
            android.os.Bundle r0 = r4.A07     // Catch:{ all -> 0x0900 }
            r1.A01(r0, r4)     // Catch:{ all -> 0x0900 }
            goto L_0x0039
        L_0x0373:
            boolean r0 = X.C08270df.A05(r9)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0382
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "moveto CREATED: "
            X.AnonymousClass000.A19(r4, r0, r7, r1)     // Catch:{ all -> 0x0900 }
        L_0x0382:
            boolean r0 = r4.A0f     // Catch:{ all -> 0x0900 }
            if (r0 != 0) goto L_0x0615
            X.0R3 r5 = r15.A03     // Catch:{ all -> 0x0900 }
            android.os.Bundle r0 = r4.A07     // Catch:{ all -> 0x0900 }
            r5.A03(r0, r4)     // Catch:{ all -> 0x0900 }
            android.os.Bundle r3 = r4.A07     // Catch:{ all -> 0x0900 }
            X.0df r0 = r4.A0H     // Catch:{ all -> 0x0900 }
            r0.A0L()     // Catch:{ all -> 0x0900 }
            r4.A04 = r6     // Catch:{ all -> 0x0900 }
            r4.A0X = r2     // Catch:{ all -> 0x0900 }
            X.08A r1 = r4.A0L     // Catch:{ all -> 0x0900 }
            androidx.fragment.app.Fragment$6 r0 = new androidx.fragment.app.Fragment$6     // Catch:{ all -> 0x0900 }
            r0.<init>(r4)     // Catch:{ all -> 0x0900 }
            r1.A00(r0)     // Catch:{ all -> 0x0900 }
            X.0PU r0 = r4.A0O     // Catch:{ all -> 0x0900 }
            r0.A01(r3)     // Catch:{ all -> 0x0900 }
            r4.A0p(r3)     // Catch:{ all -> 0x0900 }
            r4.A0f = r6     // Catch:{ all -> 0x0900 }
            boolean r0 = r4.A0X     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0844
            X.08A r1 = r4.A0L     // Catch:{ all -> 0x0900 }
            X.0GH r0 = X.AnonymousClass0GH.ON_CREATE     // Catch:{ all -> 0x0900 }
            r1.A04(r0)     // Catch:{ all -> 0x0900 }
            android.os.Bundle r0 = r4.A07     // Catch:{ all -> 0x0900 }
            r5.A02(r0, r4)     // Catch:{ all -> 0x0900 }
            goto L_0x0039
        L_0x03be:
            int r0 = r1 + -1
            switch(r0) {
                case -1: goto L_0x061e;
                case 0: goto L_0x043f;
                case 1: goto L_0x059a;
                case 2: goto L_0x040d;
                case 3: goto L_0x03ca;
                case 4: goto L_0x0558;
                case 5: goto L_0x03c5;
                case 6: goto L_0x051c;
                default: goto L_0x03c3;
            }     // Catch:{ all -> 0x0900 }
        L_0x03c3:
            goto L_0x0039
        L_0x03c5:
            r0 = 5
        L_0x03c6:
            r4.A04 = r0     // Catch:{ all -> 0x0900 }
            goto L_0x0039
        L_0x03ca:
            boolean r0 = X.C08270df.A05(r9)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x03d9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "movefrom ACTIVITY_CREATED: "
            X.AnonymousClass000.A19(r4, r0, r7, r1)     // Catch:{ all -> 0x0900 }
        L_0x03d9:
            android.view.View r0 = r4.A0B     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x03e4
            android.util.SparseArray r0 = r4.A09     // Catch:{ all -> 0x0900 }
            if (r0 != 0) goto L_0x03e4
            r15.A05()     // Catch:{ all -> 0x0900 }
        L_0x03e4:
            android.view.View r0 = r4.A0B     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0409
            android.view.ViewGroup r0 = r4.A0C     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0409
            r4.A0U()     // Catch:{ all -> 0x0900 }
            X.0UN r3 = X.AnonymousClass0UN.A01(r0)     // Catch:{ all -> 0x0900 }
            boolean r0 = X.C08270df.A05(r8)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0402
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "SpecialEffectsController: Enqueuing remove operation for fragment "
            X.AnonymousClass000.A18(r4, r0, r7, r1)     // Catch:{ all -> 0x0900 }
        L_0x0402:
            X.0GJ r1 = X.AnonymousClass0GJ.REMOVED     // Catch:{ all -> 0x0900 }
            X.0Fc r0 = X.C02160Fc.REMOVING     // Catch:{ all -> 0x0900 }
            r3.A06(r15, r0, r1)     // Catch:{ all -> 0x0900 }
        L_0x0409:
            r4.A04 = r9     // Catch:{ all -> 0x0900 }
            goto L_0x0039
        L_0x040d:
            r4.A0e = r2     // Catch:{ all -> 0x0900 }
            goto L_0x043b
        L_0x0410:
            android.view.View r0 = r4.A0B     // Catch:{ all -> 0x0900 }
            android.view.View r3 = r0.findFocus()     // Catch:{ all -> 0x0900 }
            if (r3 == 0) goto L_0x0435
            X.0Mp r0 = r4.A0M()     // Catch:{ all -> 0x0900 }
            r0.A06 = r3     // Catch:{ all -> 0x0900 }
            boolean r0 = X.C08270df.A05(r8)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0435
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "requestFocus: Saved focused view "
            r1.append(r0)     // Catch:{ all -> 0x0900 }
            r1.append(r3)     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = " for Fragment "
            X.AnonymousClass000.A18(r4, r0, r7, r1)     // Catch:{ all -> 0x0900 }
        L_0x0435:
            android.view.View r1 = r4.A0B     // Catch:{ all -> 0x0900 }
            r0 = 0
            r1.setAlpha(r0)     // Catch:{ all -> 0x0900 }
        L_0x043b:
            r4.A04 = r8     // Catch:{ all -> 0x0900 }
            goto L_0x0039
        L_0x043f:
            boolean r0 = X.C08270df.A05(r9)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x044e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "movefrom CREATED: "
            X.AnonymousClass000.A19(r4, r0, r7, r1)     // Catch:{ all -> 0x0900 }
        L_0x044e:
            boolean r0 = r4.A0i     // Catch:{ all -> 0x0900 }
            r3 = 1
            if (r0 == 0) goto L_0x0458
            int r0 = r4.A00     // Catch:{ all -> 0x0900 }
            r11 = 1
            if (r0 <= 0) goto L_0x0459
        L_0x0458:
            r11 = 0
        L_0x0459:
            r10 = 0
            if (r11 == 0) goto L_0x045d
            goto L_0x0487
        L_0x045d:
            X.0Qo r9 = r15.A04     // Catch:{ all -> 0x0900 }
            X.08T r5 = r9.A00     // Catch:{ all -> 0x0900 }
            java.util.HashMap r1 = r5.A03     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = r4.A0V     // Catch:{ all -> 0x0900 }
            boolean r0 = r1.containsKey(r0)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0490
            boolean r0 = r5.A05     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0490
            boolean r0 = r5.A00     // Catch:{ all -> 0x0900 }
            if (r0 != 0) goto L_0x0490
            java.lang.String r0 = r4.A0U     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0483
            X.0eF r1 = r9.A02(r0)     // Catch:{ all -> 0x0900 }
            if (r1 == 0) goto L_0x0483
            boolean r0 = r1.A0k     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0483
            r4.A0F = r1     // Catch:{ all -> 0x0900 }
        L_0x0483:
            r4.A04 = r2     // Catch:{ all -> 0x0900 }
            goto L_0x0039
        L_0x0487:
            X.0Qo r9 = r15.A04     // Catch:{ all -> 0x0900 }
            java.lang.String r1 = r4.A0V     // Catch:{ all -> 0x0900 }
            java.util.HashMap r0 = r9.A03     // Catch:{ all -> 0x0900 }
            r0.remove(r1)     // Catch:{ all -> 0x0900 }
        L_0x0490:
            X.07u r1 = r4.A0G     // Catch:{ all -> 0x0900 }
            boolean r0 = r1 instanceof X.C15940sD     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x049b
            X.08T r0 = r9.A00     // Catch:{ all -> 0x0900 }
            boolean r3 = r0.A00     // Catch:{ all -> 0x0900 }
            goto L_0x04a9
        L_0x049b:
            android.content.Context r1 = r1.A01     // Catch:{ all -> 0x0900 }
            boolean r0 = r1 instanceof android.app.Activity     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x04a9
            android.app.Activity r1 = (android.app.Activity) r1     // Catch:{ all -> 0x0900 }
            boolean r0 = r1.isChangingConfigurations()     // Catch:{ all -> 0x0900 }
            r3 = r0 ^ 1
        L_0x04a9:
            if (r11 != 0) goto L_0x04ad
            if (r3 == 0) goto L_0x04c8
        L_0x04ad:
            X.08T r3 = r9.A00     // Catch:{ all -> 0x0900 }
            r0 = 3
            boolean r0 = X.C08270df.A05(r0)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x04c3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "Clearing non-config state for "
            java.lang.String r0 = X.AnonymousClass000.A0P(r4, r0, r1)     // Catch:{ all -> 0x0900 }
            android.util.Log.d(r7, r0)     // Catch:{ all -> 0x0900 }
        L_0x04c3:
            java.lang.String r0 = r4.A0V     // Catch:{ all -> 0x0900 }
            r3.A0E(r0)     // Catch:{ all -> 0x0900 }
        L_0x04c8:
            X.0df r0 = r4.A0H     // Catch:{ all -> 0x0900 }
            r0.A0I()     // Catch:{ all -> 0x0900 }
            X.08A r1 = r4.A0L     // Catch:{ all -> 0x0900 }
            X.0GH r0 = X.AnonymousClass0GH.ON_DESTROY     // Catch:{ all -> 0x0900 }
            r1.A04(r0)     // Catch:{ all -> 0x0900 }
            r4.A04 = r2     // Catch:{ all -> 0x0900 }
            r4.A0X = r2     // Catch:{ all -> 0x0900 }
            r4.A0f = r2     // Catch:{ all -> 0x0900 }
            r4.A0a()     // Catch:{ all -> 0x0900 }
            boolean r0 = r4.A0X     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x080d
            X.0R3 r0 = r15.A03     // Catch:{ all -> 0x0900 }
            r0.A06(r4)     // Catch:{ all -> 0x0900 }
            java.util.List r0 = r9.A04()     // Catch:{ all -> 0x0900 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0900 }
        L_0x04ee:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x050d
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0900 }
            X.0WE r0 = (X.AnonymousClass0WE) r0     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x04ee
            X.0eF r3 = r0.A02     // Catch:{ all -> 0x0900 }
            java.lang.String r1 = r4.A0V     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = r3.A0U     // Catch:{ all -> 0x0900 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x04ee
            r3.A0F = r4     // Catch:{ all -> 0x0900 }
            r3.A0U = r10     // Catch:{ all -> 0x0900 }
            goto L_0x04ee
        L_0x050d:
            java.lang.String r0 = r4.A0U     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0517
            X.0eF r0 = r9.A02(r0)     // Catch:{ all -> 0x0900 }
            r4.A0F = r0     // Catch:{ all -> 0x0900 }
        L_0x0517:
            r9.A08(r15)     // Catch:{ all -> 0x0900 }
            goto L_0x0039
        L_0x051c:
            boolean r0 = X.C08270df.A05(r9)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x052b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "movefrom RESUMED: "
            X.AnonymousClass000.A19(r4, r0, r7, r1)     // Catch:{ all -> 0x0900 }
        L_0x052b:
            X.0df r1 = r4.A0H     // Catch:{ all -> 0x0900 }
            r0 = 5
            r1.A0S(r0)     // Catch:{ all -> 0x0900 }
            android.view.View r0 = r4.A0B     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x053e
            X.0dn r0 = r4.A0J     // Catch:{ all -> 0x0900 }
            X.0GH r1 = X.AnonymousClass0GH.ON_PAUSE     // Catch:{ all -> 0x0900 }
            X.08A r0 = r0.A00     // Catch:{ all -> 0x0900 }
            r0.A04(r1)     // Catch:{ all -> 0x0900 }
        L_0x053e:
            X.08A r1 = r4.A0L     // Catch:{ all -> 0x0900 }
            X.0GH r0 = X.AnonymousClass0GH.ON_PAUSE     // Catch:{ all -> 0x0900 }
            r1.A04(r0)     // Catch:{ all -> 0x0900 }
            r0 = 6
            r4.A04 = r0     // Catch:{ all -> 0x0900 }
            r4.A0X = r2     // Catch:{ all -> 0x0900 }
            r4.A0e()     // Catch:{ all -> 0x0900 }
            boolean r0 = r4.A0X     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0818
            X.0R3 r0 = r15.A03     // Catch:{ all -> 0x0900 }
            r0.A0C(r4, r2)     // Catch:{ all -> 0x0900 }
            goto L_0x0039
        L_0x0558:
            boolean r0 = X.C08270df.A05(r9)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0567
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "movefrom STARTED: "
            X.AnonymousClass000.A19(r4, r0, r7, r1)     // Catch:{ all -> 0x0900 }
        L_0x0567:
            X.0df r1 = r4.A0H     // Catch:{ all -> 0x0900 }
            r1.A0P = r6     // Catch:{ all -> 0x0900 }
            X.08T r0 = r1.A0A     // Catch:{ all -> 0x0900 }
            r0.A01 = r6     // Catch:{ all -> 0x0900 }
            r0 = 4
            r1.A0S(r0)     // Catch:{ all -> 0x0900 }
            android.view.View r0 = r4.A0B     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0580
            X.0dn r0 = r4.A0J     // Catch:{ all -> 0x0900 }
            X.0GH r1 = X.AnonymousClass0GH.ON_STOP     // Catch:{ all -> 0x0900 }
            X.08A r0 = r0.A00     // Catch:{ all -> 0x0900 }
            r0.A04(r1)     // Catch:{ all -> 0x0900 }
        L_0x0580:
            X.08A r1 = r4.A0L     // Catch:{ all -> 0x0900 }
            X.0GH r0 = X.AnonymousClass0GH.ON_STOP     // Catch:{ all -> 0x0900 }
            r1.A04(r0)     // Catch:{ all -> 0x0900 }
            r0 = 4
            r4.A04 = r0     // Catch:{ all -> 0x0900 }
            r4.A0X = r2     // Catch:{ all -> 0x0900 }
            r4.A0h()     // Catch:{ all -> 0x0900 }
            boolean r0 = r4.A0X     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0823
            X.0R3 r0 = r15.A03     // Catch:{ all -> 0x0900 }
            r0.A09(r4)     // Catch:{ all -> 0x0900 }
            goto L_0x0039
        L_0x059a:
            boolean r0 = X.C08270df.A05(r9)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x05a9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "movefrom CREATE_VIEW: "
            X.AnonymousClass000.A19(r4, r0, r7, r1)     // Catch:{ all -> 0x0900 }
        L_0x05a9:
            android.view.ViewGroup r1 = r4.A0C     // Catch:{ all -> 0x0900 }
            if (r1 == 0) goto L_0x05b4
            android.view.View r0 = r4.A0B     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x05b4
            r1.removeView(r0)     // Catch:{ all -> 0x0900 }
        L_0x05b4:
            X.0df r0 = r4.A0H     // Catch:{ all -> 0x0900 }
            r0.A0S(r6)     // Catch:{ all -> 0x0900 }
            android.view.View r0 = r4.A0B     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x05db
            X.0dn r0 = r4.A0J     // Catch:{ all -> 0x0900 }
            r0.A00()     // Catch:{ all -> 0x0900 }
            X.08A r0 = r0.A00     // Catch:{ all -> 0x0900 }
            X.0GC r1 = r0.A02     // Catch:{ all -> 0x0900 }
            X.0GC r0 = X.AnonymousClass0GC.CREATED     // Catch:{ all -> 0x0900 }
            int r0 = r1.compareTo(r0)     // Catch:{ all -> 0x0900 }
            boolean r0 = X.AnonymousClass001.A1U(r0)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x05db
            X.0dn r0 = r4.A0J     // Catch:{ all -> 0x0900 }
            X.0GH r1 = X.AnonymousClass0GH.ON_DESTROY     // Catch:{ all -> 0x0900 }
            X.08A r0 = r0.A00     // Catch:{ all -> 0x0900 }
            r0.A04(r1)     // Catch:{ all -> 0x0900 }
        L_0x05db:
            r4.A04 = r6     // Catch:{ all -> 0x0900 }
            r4.A0X = r2     // Catch:{ all -> 0x0900 }
            r4.A0c()     // Catch:{ all -> 0x0900 }
            boolean r0 = r4.A0X     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x082e
            X.0WA r0 = X.AnonymousClass0WA.A00(r4)     // Catch:{ all -> 0x0900 }
            X.08Q r0 = r0.A01     // Catch:{ all -> 0x0900 }
            X.0i5 r5 = r0.A00     // Catch:{ all -> 0x0900 }
            int r3 = r5.A00     // Catch:{ all -> 0x0900 }
            r1 = 0
        L_0x05f1:
            if (r1 >= r3) goto L_0x05ff
            java.lang.Object[] r0 = r5.A02     // Catch:{ all -> 0x0900 }
            r0 = r0[r1]     // Catch:{ all -> 0x0900 }
            X.08L r0 = (X.AnonymousClass08L) r0     // Catch:{ all -> 0x0900 }
            r0.A0J()     // Catch:{ all -> 0x0900 }
            int r1 = r1 + 1
            goto L_0x05f1
        L_0x05ff:
            r4.A0h = r2     // Catch:{ all -> 0x0900 }
            X.0R3 r0 = r15.A03     // Catch:{ all -> 0x0900 }
            r0.A0A(r4)     // Catch:{ all -> 0x0900 }
            r1 = 0
            r4.A0C = r1     // Catch:{ all -> 0x0900 }
            r4.A0B = r1     // Catch:{ all -> 0x0900 }
            r4.A0J = r1     // Catch:{ all -> 0x0900 }
            X.08M r0 = r4.A0M     // Catch:{ all -> 0x0900 }
            r0.A0H(r1)     // Catch:{ all -> 0x0900 }
            r4.A0e = r2     // Catch:{ all -> 0x0900 }
            goto L_0x061a
        L_0x0615:
            android.os.Bundle r0 = r4.A07     // Catch:{ all -> 0x0900 }
            r4.A0t(r0)     // Catch:{ all -> 0x0900 }
        L_0x061a:
            r4.A04 = r6     // Catch:{ all -> 0x0900 }
            goto L_0x0039
        L_0x061e:
            boolean r0 = X.C08270df.A05(r9)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x062d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "movefrom ATTACHED: "
            X.AnonymousClass000.A19(r4, r0, r7, r1)     // Catch:{ all -> 0x0900 }
        L_0x062d:
            r0 = -1
            r4.A04 = r0     // Catch:{ all -> 0x0900 }
            r4.A0X = r2     // Catch:{ all -> 0x0900 }
            r4.A0d()     // Catch:{ all -> 0x0900 }
            r0 = 0
            r4.A0A = r0     // Catch:{ all -> 0x0900 }
            boolean r0 = r4.A0X     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0839
            X.0df r1 = r4.A0H     // Catch:{ all -> 0x0900 }
            boolean r0 = r1.A0K     // Catch:{ all -> 0x0900 }
            if (r0 != 0) goto L_0x064c
            r1.A0I()     // Catch:{ all -> 0x0900 }
            X.07w r0 = new X.07w     // Catch:{ all -> 0x0900 }
            r0.<init>()     // Catch:{ all -> 0x0900 }
            r4.A0H = r0     // Catch:{ all -> 0x0900 }
        L_0x064c:
            X.0R3 r0 = r15.A03     // Catch:{ all -> 0x0900 }
            r0.A0B(r4, r2)     // Catch:{ all -> 0x0900 }
            r0 = -1
            r4.A04 = r0     // Catch:{ all -> 0x0900 }
            r0 = 0
            r4.A0G = r0     // Catch:{ all -> 0x0900 }
            r4.A0E = r0     // Catch:{ all -> 0x0900 }
            r4.A0I = r0     // Catch:{ all -> 0x0900 }
            boolean r0 = r4.A0i     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0663
            int r0 = r4.A00     // Catch:{ all -> 0x0900 }
            if (r0 <= 0) goto L_0x0679
        L_0x0663:
            X.0Qo r0 = r15.A04     // Catch:{ all -> 0x0900 }
            X.08T r3 = r0.A00     // Catch:{ all -> 0x0900 }
            java.util.HashMap r1 = r3.A03     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = r4.A0V     // Catch:{ all -> 0x0900 }
            boolean r0 = r1.containsKey(r0)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0679
            boolean r0 = r3.A05     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0679
            boolean r0 = r3.A00     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0039
        L_0x0679:
            boolean r0 = X.C08270df.A05(r9)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0688
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "initState called for fragment: "
            X.AnonymousClass000.A19(r4, r0, r7, r1)     // Catch:{ all -> 0x0900 }
        L_0x0688:
            r4.A0Z()     // Catch:{ all -> 0x0900 }
            goto L_0x0039
        L_0x068d:
            int r3 = r15.A00     // Catch:{ all -> 0x0900 }
            r11 = r3
            X.0GC r0 = r4.A0K     // Catch:{ all -> 0x0900 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0900 }
            r9 = -1
            r5 = 5
            r10 = 3
            r1 = 4
            if (r0 == r1) goto L_0x06b5
            if (r0 == r10) goto L_0x06ac
            if (r0 == r8) goto L_0x06a7
            if (r0 == r6) goto L_0x06b1
            int r3 = java.lang.Math.min(r3, r9)     // Catch:{ all -> 0x0900 }
            goto L_0x06b5
        L_0x06a7:
            int r3 = java.lang.Math.min(r3, r6)     // Catch:{ all -> 0x0900 }
            goto L_0x06b5
        L_0x06ac:
            int r3 = java.lang.Math.min(r3, r5)     // Catch:{ all -> 0x0900 }
            goto L_0x06b5
        L_0x06b1:
            int r3 = java.lang.Math.min(r3, r2)     // Catch:{ all -> 0x0900 }
        L_0x06b5:
            boolean r0 = r4.A0a     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x06cf
            boolean r0 = r4.A0e     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0723
            int r3 = java.lang.Math.max(r11, r8)     // Catch:{ all -> 0x0900 }
            android.view.View r0 = r4.A0B     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x06cf
            android.view.ViewParent r0 = r0.getParent()     // Catch:{ all -> 0x0900 }
            if (r0 != 0) goto L_0x06cf
            int r3 = java.lang.Math.min(r3, r8)     // Catch:{ all -> 0x0900 }
        L_0x06cf:
            boolean r0 = r4.A0W     // Catch:{ all -> 0x0900 }
            if (r0 != 0) goto L_0x06d7
            int r3 = java.lang.Math.min(r3, r6)     // Catch:{ all -> 0x0900 }
        L_0x06d7:
            android.view.ViewGroup r0 = r4.A0C     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0734
            r4.A0U()     // Catch:{ all -> 0x0900 }
            X.0UN r12 = X.AnonymousClass0UN.A01(r0)     // Catch:{ all -> 0x0900 }
            java.util.ArrayList r0 = r12.A03     // Catch:{ all -> 0x0900 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x0900 }
        L_0x06e8:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0721
            java.lang.Object r11 = r13.next()     // Catch:{ all -> 0x0900 }
            X.0QW r11 = (X.AnonymousClass0QW) r11     // Catch:{ all -> 0x0900 }
            X.0eF r0 = r11.A04     // Catch:{ all -> 0x0900 }
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x06e8
            boolean r0 = r11.A02     // Catch:{ all -> 0x0900 }
            if (r0 != 0) goto L_0x06e8
            X.0Fc r11 = r11.A00     // Catch:{ all -> 0x0900 }
        L_0x0702:
            java.util.ArrayList r0 = r12.A04     // Catch:{ all -> 0x0900 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x0900 }
        L_0x0708:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x073c
            java.lang.Object r12 = r13.next()     // Catch:{ all -> 0x0900 }
            X.0QW r12 = (X.AnonymousClass0QW) r12     // Catch:{ all -> 0x0900 }
            X.0eF r0 = r12.A04     // Catch:{ all -> 0x0900 }
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0708
            boolean r0 = r12.A02     // Catch:{ all -> 0x0900 }
            if (r0 != 0) goto L_0x0708
            goto L_0x0731
        L_0x0721:
            r11 = 0
            goto L_0x0702
        L_0x0723:
            if (r11 >= r1) goto L_0x072c
            int r0 = r4.A04     // Catch:{ all -> 0x0900 }
            int r3 = java.lang.Math.min(r3, r0)     // Catch:{ all -> 0x0900 }
            goto L_0x06cf
        L_0x072c:
            int r3 = java.lang.Math.min(r3, r6)     // Catch:{ all -> 0x0900 }
            goto L_0x06cf
        L_0x0731:
            if (r11 == 0) goto L_0x073a
            goto L_0x0736
        L_0x0734:
            r11 = 0
            goto L_0x073c
        L_0x0736:
            X.0Fc r0 = X.C02160Fc.NONE     // Catch:{ all -> 0x0900 }
            if (r11 != r0) goto L_0x073c
        L_0x073a:
            X.0Fc r11 = r12.A00     // Catch:{ all -> 0x0900 }
        L_0x073c:
            X.0Fc r0 = X.C02160Fc.ADDING     // Catch:{ all -> 0x0900 }
            if (r11 != r0) goto L_0x076a
            r0 = 6
            int r3 = java.lang.Math.min(r3, r0)     // Catch:{ all -> 0x0900 }
        L_0x0745:
            boolean r0 = r4.A0Y     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0751
            int r0 = r4.A04     // Catch:{ all -> 0x0900 }
            if (r0 >= r5) goto L_0x0751
            int r3 = java.lang.Math.min(r3, r1)     // Catch:{ all -> 0x0900 }
        L_0x0751:
            boolean r0 = X.C08270df.A05(r8)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x002d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "computeExpectedState() of "
            r1.append(r0)     // Catch:{ all -> 0x0900 }
            r1.append(r3)     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = " for "
            X.AnonymousClass000.A18(r4, r0, r7, r1)     // Catch:{ all -> 0x0900 }
            goto L_0x002d
        L_0x076a:
            X.0Fc r0 = X.C02160Fc.REMOVING     // Catch:{ all -> 0x0900 }
            if (r11 != r0) goto L_0x0773
            int r3 = java.lang.Math.max(r3, r10)     // Catch:{ all -> 0x0900 }
            goto L_0x0745
        L_0x0773:
            boolean r0 = r4.A0i     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0745
            int r0 = r4.A00     // Catch:{ all -> 0x0900 }
            if (r0 <= 0) goto L_0x0780
            int r3 = java.lang.Math.min(r3, r6)     // Catch:{ all -> 0x0900 }
            goto L_0x0745
        L_0x0780:
            int r3 = java.lang.Math.min(r3, r9)     // Catch:{ all -> 0x0900 }
            goto L_0x0745
        L_0x0785:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0k(r4, r9)     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = " did not call through to super.onAttach()"
            X.02G r0 = A00(r0, r1)     // Catch:{ all -> 0x0900 }
            goto L_0x084e
        L_0x0791:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0k(r4, r9)     // Catch:{ all -> 0x0900 }
            r1.append(r5)     // Catch:{ all -> 0x0900 }
            X.0eF r0 = r4.A0F     // Catch:{ all -> 0x0900 }
            r1.append(r0)     // Catch:{ all -> 0x0900 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r3, r1)     // Catch:{ all -> 0x0900 }
            goto L_0x084e
        L_0x07a3:
            android.content.res.Resources r1 = X.C08310eF.A09(r4)     // Catch:{ NotFoundException -> 0x07ae }
            int r0 = r4.A01     // Catch:{ NotFoundException -> 0x07ae }
            java.lang.String r3 = r1.getResourceName(r0)     // Catch:{ NotFoundException -> 0x07ae }
            goto L_0x07b0
        L_0x07ae:
            java.lang.String r3 = "unknown"
        L_0x07b0:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "No view found for id 0x"
            r1.append(r0)     // Catch:{ all -> 0x0900 }
            int r0 = r4.A01     // Catch:{ all -> 0x0900 }
            X.AnonymousClass001.A1N(r1, r0)     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = " ("
            r1.append(r0)     // Catch:{ all -> 0x0900 }
            r1.append(r3)     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = ") for fragment "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0E(r4, r0, r1)     // Catch:{ all -> 0x0900 }
            goto L_0x084e
        L_0x07ce:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "Cannot create fragment "
            r1.append(r0)     // Catch:{ all -> 0x0900 }
            r1.append(r4)     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = " for a container view with no id"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)     // Catch:{ all -> 0x0900 }
            goto L_0x084e
        L_0x07e1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0j(r4)     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = " did not call through to super.onResume()"
            X.02G r0 = A00(r0, r1)     // Catch:{ all -> 0x0900 }
            goto L_0x084e
        L_0x07ec:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0j(r4)     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = " did not call through to super.onStart()"
            X.02G r0 = A00(r0, r1)     // Catch:{ all -> 0x0900 }
            goto L_0x084e
        L_0x07f7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0j(r4)     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = " did not call through to super.onViewStateRestored()"
            X.02G r0 = A00(r0, r1)     // Catch:{ all -> 0x0900 }
            goto L_0x084e
        L_0x0802:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0j(r4)     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = " did not call through to super.onActivityCreated()"
            X.02G r0 = A00(r0, r1)     // Catch:{ all -> 0x0900 }
            goto L_0x084e
        L_0x080d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0j(r4)     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = " did not call through to super.onDestroy()"
            X.02G r0 = A00(r0, r1)     // Catch:{ all -> 0x0900 }
            goto L_0x084e
        L_0x0818:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0j(r4)     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = " did not call through to super.onPause()"
            X.02G r0 = A00(r0, r1)     // Catch:{ all -> 0x0900 }
            goto L_0x084e
        L_0x0823:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0j(r4)     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = " did not call through to super.onStop()"
            X.02G r0 = A00(r0, r1)     // Catch:{ all -> 0x0900 }
            goto L_0x084e
        L_0x082e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0j(r4)     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = " did not call through to super.onDestroyView()"
            X.02G r0 = A00(r0, r1)     // Catch:{ all -> 0x0900 }
            goto L_0x084e
        L_0x0839:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0j(r4)     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = " did not call through to super.onDetach()"
            X.02G r0 = A00(r0, r1)     // Catch:{ all -> 0x0900 }
            goto L_0x084e
        L_0x0844:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0j(r4)     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = " did not call through to super.onCreate()"
            X.02G r0 = A00(r0, r1)     // Catch:{ all -> 0x0900 }
        L_0x084e:
            throw r0     // Catch:{ all -> 0x0900 }
        L_0x084f:
            if (r14 != 0) goto L_0x089c
            r0 = -1
            if (r1 != r0) goto L_0x089c
            boolean r0 = r4.A0i     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x089c
            int r0 = r4.A00     // Catch:{ all -> 0x0900 }
            if (r0 > 0) goto L_0x089c
            boolean r0 = X.C08270df.A05(r9)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x086b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "Cleaning up state of never attached fragment: "
            X.AnonymousClass000.A19(r4, r0, r7, r1)     // Catch:{ all -> 0x0900 }
        L_0x086b:
            X.0Qo r5 = r15.A04     // Catch:{ all -> 0x0900 }
            X.08T r3 = r5.A00     // Catch:{ all -> 0x0900 }
            boolean r0 = X.C08270df.A05(r9)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0882
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "Clearing non-config state for "
            java.lang.String r0 = X.AnonymousClass000.A0P(r4, r0, r1)     // Catch:{ all -> 0x0900 }
            android.util.Log.d(r7, r0)     // Catch:{ all -> 0x0900 }
        L_0x0882:
            java.lang.String r0 = r4.A0V     // Catch:{ all -> 0x0900 }
            r3.A0E(r0)     // Catch:{ all -> 0x0900 }
            r5.A08(r15)     // Catch:{ all -> 0x0900 }
            boolean r0 = X.C08270df.A05(r9)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x0899
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "initState called for fragment: "
            X.AnonymousClass000.A19(r4, r0, r7, r1)     // Catch:{ all -> 0x0900 }
        L_0x0899:
            r4.A0Z()     // Catch:{ all -> 0x0900 }
        L_0x089c:
            boolean r0 = r4.A0d     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x08fd
            android.view.View r0 = r4.A0B     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x08c9
            android.view.ViewGroup r0 = r4.A0C     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x08c9
            r4.A0U()     // Catch:{ all -> 0x0900 }
            X.0UN r3 = X.AnonymousClass0UN.A01(r0)     // Catch:{ all -> 0x0900 }
            boolean r0 = r4.A0c     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x08e6
            boolean r0 = X.C08270df.A05(r8)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x08c2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "SpecialEffectsController: Enqueuing hide operation for fragment "
            X.AnonymousClass000.A18(r4, r0, r7, r1)     // Catch:{ all -> 0x0900 }
        L_0x08c2:
            X.0GJ r1 = X.AnonymousClass0GJ.GONE     // Catch:{ all -> 0x0900 }
            X.0Fc r0 = X.C02160Fc.NONE     // Catch:{ all -> 0x0900 }
            r3.A06(r15, r0, r1)     // Catch:{ all -> 0x0900 }
        L_0x08c9:
            X.0df r1 = r4.A0I     // Catch:{ all -> 0x0900 }
            if (r1 == 0) goto L_0x08d9
            boolean r0 = r4.A0W     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x08d9
            boolean r0 = X.C08270df.A06(r4)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x08d9
            r1.A0N = r6     // Catch:{ all -> 0x0900 }
        L_0x08d9:
            r4.A0d = r2     // Catch:{ all -> 0x0900 }
            boolean r0 = r4.A0c     // Catch:{ all -> 0x0900 }
            r4.A12(r0)     // Catch:{ all -> 0x0900 }
            X.0df r0 = r4.A0H     // Catch:{ all -> 0x0900 }
            r0.A0J()     // Catch:{ all -> 0x0900 }
            goto L_0x08fd
        L_0x08e6:
            boolean r0 = X.C08270df.A05(r8)     // Catch:{ all -> 0x0900 }
            if (r0 == 0) goto L_0x08f5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0900 }
            java.lang.String r0 = "SpecialEffectsController: Enqueuing show operation for fragment "
            X.AnonymousClass000.A18(r4, r0, r7, r1)     // Catch:{ all -> 0x0900 }
        L_0x08f5:
            X.0GJ r1 = X.AnonymousClass0GJ.VISIBLE     // Catch:{ all -> 0x0900 }
            X.0Fc r0 = X.C02160Fc.NONE     // Catch:{ all -> 0x0900 }
            r3.A06(r15, r0, r1)     // Catch:{ all -> 0x0900 }
            goto L_0x08c9
        L_0x08fd:
            r15.A01 = r2
            return
        L_0x0900:
            r0 = move-exception
            r15.A01 = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WE.A04():void");
    }

    public void A05() {
        C08310eF r2 = this.A02;
        if (r2.A0B != null) {
            if (C08270df.A04()) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Saving view state for fragment ");
                A0o.append(r2);
                A0o.append(" with view ");
                Log.v("FragmentManager", AnonymousClass000.A0R(r2.A0B, A0o));
            }
            SparseArray sparseArray = new SparseArray();
            r2.A0B.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                r2.A09 = sparseArray;
            }
            Bundle A08 = AnonymousClass002.A08();
            r2.A0J.A02.A02(A08);
            if (!A08.isEmpty()) {
                r2.A08 = A08;
            }
        }
    }

    public void A06(ClassLoader classLoader) {
        boolean z;
        C08310eF r3 = this.A02;
        Bundle bundle = r3.A07;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            r3.A09 = r3.A07.getSparseParcelableArray("android:view_state");
            r3.A08 = r3.A07.getBundle("android:view_registry_state");
            String string = r3.A07.getString("android:target_state");
            r3.A0U = string;
            if (string != null) {
                r3.A05 = r3.A07.getInt("android:target_req_state", 0);
            }
            Boolean bool = r3.A0Q;
            if (bool != null) {
                z = bool.booleanValue();
                r3.A0l = z;
                r3.A0Q = null;
            } else {
                z = r3.A07.getBoolean("android:user_visible_hint", true);
                r3.A0l = z;
            }
            if (!z) {
                r3.A0Y = true;
            }
        }
    }

    public AnonymousClass0WE(C08310eF r4, AnonymousClass0R3 r5, C06820Zi r6, C04760Qo r7) {
        String str;
        this.A03 = r5;
        this.A04 = r7;
        this.A02 = r4;
        r4.A09 = null;
        r4.A08 = null;
        r4.A00 = 0;
        r4.A0e = false;
        r4.A0W = false;
        C08310eF r0 = r4.A0F;
        if (r0 != null) {
            str = r0.A0V;
        } else {
            str = null;
        }
        r4.A0U = str;
        r4.A0F = null;
        Bundle bundle = r6.A00;
        r4.A07 = bundle == null ? AnonymousClass002.A08() : bundle;
    }

    public static AnonymousClass02G A00(String str, StringBuilder sb) {
        sb.append(str);
        return new AnonymousClass02G(sb.toString());
    }

    public final Bundle A01() {
        Bundle A08 = AnonymousClass002.A08();
        C08310eF r2 = this.A02;
        r2.A0s(A08);
        this.A03.A04(A08, r2);
        if (A08.isEmpty()) {
            A08 = null;
        }
        if (r2.A0B != null) {
            A05();
        }
        if (r2.A09 != null) {
            if (A08 == null) {
                A08 = AnonymousClass002.A08();
            }
            A08.putSparseParcelableArray("android:view_state", r2.A09);
        }
        if (r2.A08 != null) {
            if (A08 == null) {
                A08 = AnonymousClass002.A08();
            }
            A08.putBundle("android:view_registry_state", r2.A08);
        }
        if (!r2.A0l) {
            if (A08 == null) {
                A08 = AnonymousClass002.A08();
            }
            A08.putBoolean("android:user_visible_hint", r2.A0l);
        }
        return A08;
    }

    public AnonymousClass0WE(AnonymousClass0R3 r4, C05930Vn r5, C06820Zi r6, C04760Qo r7, ClassLoader classLoader) {
        this.A03 = r4;
        this.A04 = r7;
        C08310eF A002 = r5.A00(r6.A05);
        Bundle bundle = r6.A04;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        A002.A0u(bundle);
        A002.A0V = r6.A07;
        A002.A0a = r6.A09;
        A002.A0j = true;
        A002.A03 = r6.A02;
        A002.A01 = r6.A01;
        A002.A0T = r6.A06;
        A002.A0k = r6.A0C;
        A002.A0i = r6.A0B;
        A002.A0Z = r6.A08;
        A002.A0c = r6.A0A;
        A002.A0K = AnonymousClass0GC.values()[r6.A03];
        Bundle bundle2 = r6.A00;
        A002.A07 = bundle2 == null ? AnonymousClass002.A08() : bundle2;
        this.A02 = A002;
        if (C08270df.A04()) {
            AnonymousClass000.A1K(AnonymousClass001.A0o(), "Instantiated fragment ", A002);
        }
    }

    public AnonymousClass0WE(C08310eF r2, AnonymousClass0R3 r3, C04760Qo r4) {
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r2;
    }
}
