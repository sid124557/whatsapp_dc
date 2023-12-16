package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5US  reason: invalid class name */
public class AnonymousClass5US {
    public AnonymousClass7N4 A00;
    public C105425Uw A01;
    public C105425Uw A02;
    public final AnonymousClass5PR A03 = new AnonymousClass5PR();
    public final List A04;
    public final List A05;

    public void A02() {
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A04.clear();
        this.A03.A00.clear();
    }

    public C105425Uw A00(PointF pointF) {
        List list = this.A04;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return null;
            }
            C105425Uw r5 = (C105425Uw) list.get(size);
            if (!(r5 instanceof C95954vE)) {
                float f = pointF.x;
                float f2 = pointF.y;
                if (r5 instanceof AnonymousClass4vC) {
                    RectF rectF = r5.A02;
                    if (rectF.contains(f, f2)) {
                        float centerX = f - rectF.centerX();
                        float centerY = f2 - rectF.centerY();
                        float width = rectF.width() / 2.0f;
                        float height = rectF.height() / 2.0f;
                        if (((centerX * centerX) / (width * width)) + ((centerY * centerY) / (height * height)) <= 1.0f) {
                            return r5;
                        }
                    } else {
                        continue;
                    }
                } else {
                    boolean z = r5 instanceof AnonymousClass4v9;
                    RectF rectF2 = r5.A02;
                    float centerX2 = rectF2.centerX();
                    float centerY2 = rectF2.centerY();
                    Matrix A052 = AnonymousClass002.A05();
                    float[] A0T = AnonymousClass4L0.A0T();
                    A0T[0] = f;
                    A0T[1] = f2;
                    A052.setRotate(-r5.A00, centerX2, centerY2);
                    A052.mapPoints(A0T);
                    if (z) {
                        float f3 = A0T[0];
                        float f4 = A0T[1];
                        if (rectF2.contains(f3, f4)) {
                            float f5 = rectF2.left;
                            float f6 = rectF2.bottom;
                            float f7 = rectF2.right;
                            float f8 = rectF2.top;
                            float f9 = f8 - f6;
                            float f10 = f7 - f5;
                            if (((double) AnonymousClass002.A00(((f3 * f9) - (f4 * f10)) + (f7 * f6), f8 * f5)) / Math.sqrt((double) ((f9 * f9) + (f10 * f10))) < ((double) C105425Uw.A05)) {
                                return r5;
                            }
                        } else {
                            continue;
                        }
                    } else if (rectF2.contains(A0T[0], A0T[1])) {
                        return r5;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043 A[LOOP:1: B:15:0x003d->B:17:0x0043, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A[EDGE_INSN: B:27:0x005a->B:22:0x005a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C105425Uw r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.C95954vE
            if (r0 == 0) goto L_0x005f
            java.util.List r3 = r4.A04
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x005f
            r0 = r5
            X.4vE r0 = (X.C95954vE) r0
            X.5Xr r0 = r0.A03
            boolean r0 = r0 instanceof X.AnonymousClass4vL
            java.util.Iterator r2 = r3.iterator()
            if (r0 == 0) goto L_0x004b
        L_0x0019:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005a
            X.5Uw r1 = X.C86664Kz.A1F(r2)
            boolean r0 = r1 instanceof X.C95954vE
            if (r0 == 0) goto L_0x0030
            r0 = r1
            X.4vE r0 = (X.C95954vE) r0
            X.5Xr r0 = r0.A03
            boolean r0 = r0 instanceof X.AnonymousClass4vL
            if (r0 != 0) goto L_0x0019
        L_0x0030:
            int r0 = r3.indexOf(r1)
        L_0x0034:
            r3.add(r0, r5)
        L_0x0037:
            r4.A01 = r5
            java.util.Iterator r1 = r3.iterator()
        L_0x003d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0065
            X.5Uw r0 = X.C86664Kz.A1F(r1)
            r0.A0E()
            goto L_0x003d
        L_0x004b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C95954vE
            if (r0 != 0) goto L_0x004b
            goto L_0x0030
        L_0x005a:
            int r0 = r3.size()
            goto L_0x0034
        L_0x005f:
            java.util.List r3 = r4.A04
            r3.add(r5)
            goto L_0x0037
        L_0x0065:
            X.6l5 r1 = new X.6l5
            r1.<init>(r5)
            X.5PR r0 = r4.A03
            java.util.LinkedList r0 = r0.A00
            r0.add(r1)
            r0 = 0
            r4.A02 = r0
            r4.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5US.A03(X.5Uw):void");
    }

    public void A04(C105425Uw r5) {
        List list = this.A04;
        int indexOf = list.indexOf(r5);
        if (indexOf != -1) {
            this.A03.A00.add(new C135706l7(r5, indexOf));
            list.remove(r5);
            if (r5 == this.A01) {
                this.A01 = null;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        r2.A02(r1);
        r1 = r1.getInt("shape_index");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        if (r1 < 0) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        if (r1 >= r5.size()) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        r2.A00 = (X.C105425Uw) r5.get(r1);
        r4.add(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(java.lang.String r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x008a
            X.5PR r2 = r7.A03     // Catch:{ JSONException -> 0x0084 }
            java.util.List r5 = r7.A04     // Catch:{ JSONException -> 0x0084 }
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r8)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r0 = "actions"
            org.json.JSONArray r6 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x0084 }
            java.util.LinkedList r4 = r2.A00     // Catch:{ JSONException -> 0x0084 }
            r4.clear()     // Catch:{ JSONException -> 0x0084 }
            r3 = 0
        L_0x0016:
            int r0 = r6.length()     // Catch:{ JSONException -> 0x0084 }
            if (r3 >= r0) goto L_0x008a
            org.json.JSONObject r1 = r6.getJSONObject(r3)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r0 = "type"
            java.lang.String r2 = r1.getString(r0)     // Catch:{ JSONException -> 0x0084 }
            int r0 = r2.hashCode()     // Catch:{ JSONException -> 0x0084 }
            switch(r0) {
                case 49116392: goto L_0x0058;
                case 1021915016: goto L_0x004a;
                case 1953129077: goto L_0x003c;
                case 1971936087: goto L_0x002e;
                default: goto L_0x002d;
            }     // Catch:{ JSONException -> 0x0084 }
        L_0x002d:
            goto L_0x0081
        L_0x002e:
            java.lang.String r0 = "undo_modify_shape"
            boolean r0 = r2.equals(r0)     // Catch:{ JSONException -> 0x0084 }
            if (r0 == 0) goto L_0x0081
            X.4vK r2 = new X.4vK     // Catch:{ JSONException -> 0x0084 }
            r2.<init>()     // Catch:{ JSONException -> 0x0084 }
            goto L_0x0065
        L_0x003c:
            java.lang.String r0 = "undo_change_z_order"
            boolean r0 = r2.equals(r0)     // Catch:{ JSONException -> 0x0084 }
            if (r0 == 0) goto L_0x0081
            X.6l6 r2 = new X.6l6     // Catch:{ JSONException -> 0x0084 }
            r2.<init>()     // Catch:{ JSONException -> 0x0084 }
            goto L_0x0065
        L_0x004a:
            java.lang.String r0 = "undo_delete_shape"
            boolean r0 = r2.equals(r0)     // Catch:{ JSONException -> 0x0084 }
            if (r0 == 0) goto L_0x0081
            X.6l7 r2 = new X.6l7     // Catch:{ JSONException -> 0x0084 }
            r2.<init>()     // Catch:{ JSONException -> 0x0084 }
            goto L_0x0065
        L_0x0058:
            java.lang.String r0 = "undo_add_shape"
            boolean r0 = r2.equals(r0)     // Catch:{ JSONException -> 0x0084 }
            if (r0 == 0) goto L_0x0081
            X.6l5 r2 = new X.6l5     // Catch:{ JSONException -> 0x0084 }
            r2.<init>()     // Catch:{ JSONException -> 0x0084 }
        L_0x0065:
            r2.A02(r1)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r0 = "shape_index"
            int r1 = r1.getInt(r0)     // Catch:{ JSONException -> 0x0084 }
            if (r1 < 0) goto L_0x0081
            int r0 = r5.size()     // Catch:{ JSONException -> 0x0084 }
            if (r1 >= r0) goto L_0x0081
            java.lang.Object r0 = r5.get(r1)     // Catch:{ JSONException -> 0x0084 }
            X.5Uw r0 = (X.C105425Uw) r0     // Catch:{ JSONException -> 0x0084 }
            r2.A00 = r0     // Catch:{ JSONException -> 0x0084 }
            r4.add(r2)     // Catch:{ JSONException -> 0x0084 }
        L_0x0081:
            int r3 = r3 + 1
            goto L_0x0016
        L_0x0084:
            r1 = move-exception
            java.lang.String r0 = "ShapeRepository/loadUndoState"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5US.A05(java.lang.String):void");
    }

    public boolean A06() {
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            if (C86664Kz.A1F(it).A0S()) {
                return true;
            }
        }
        return false;
    }

    public AnonymousClass5US() {
        ArrayList A0s = AnonymousClass001.A0s();
        this.A04 = A0s;
        this.A05 = Collections.unmodifiableList(A0s);
    }

    public List A01() {
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : this.A04) {
            if (next instanceof C95954vE) {
                A0s.add(next);
            }
        }
        return A0s;
    }
}
