package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.bloks.stdlib.components.bkcomponentsbkstextinputformatter.BKBloksComponentsBKSTextInputFormatterBinderUtil;
import com.whatsapp.R;
import java.util.LinkedList;

/* renamed from: X.7qn  reason: invalid class name and case insensitive filesystem */
public class C161897qn {
    public void A03(C153427bI r13, AnonymousClass84O r14, AnonymousClass84O r15, Object obj) {
        String str;
        String str2;
        int i;
        Object valueOf;
        EditText editText;
        AnonymousClass0Zt r2;
        View rootView;
        View.OnTouchListener r0;
        boolean z;
        AnonymousClass84O r9 = r14;
        Object obj2 = obj;
        int i2 = r14.A03;
        if (A01(i2)) {
            View view = (View) obj2;
            C153427bI r8 = r13;
            AnonymousClass84O r10 = r15;
            if (i2 != 13762) {
                if (i2 == 13566) {
                    i = R.id.testing_id_view_tag_key;
                    valueOf = AnonymousClass84O.A06(r14);
                } else if (i2 == 16310) {
                    Object A05 = C162377rs.A05(r13, r14);
                    A05.getClass();
                    C04250Nk r6 = (C04250Nk) A05;
                    C03270Jm.A00.removeCallbacks(r6.A04);
                    Object A052 = AnonymousClass84O.A05(r14, 41);
                    boolean A0W = r14.A0W(42, true);
                    if ((r6.A01 || A0W) && !AnonymousClass736.A00(A052, r6.A00)) {
                        r6.A00();
                        C835248t A0L = r14.A0L(35);
                        if (A0L != null) {
                            C152057Xj r1 = new C152057Xj();
                            r1.A04(r13, 0);
                            r1.A04(r6.A00, 1);
                            C159377lj.A01(r13, r14, C152057Xj.A01(r1, A052, 2), A0L);
                        }
                    }
                    r6.A00 = A052;
                    r6.A01 = true;
                    return;
                } else if (i2 == 13914) {
                    C03530Ko r12 = (C03530Ko) C162377rs.A05(r13, r14);
                    if (!r12.A00) {
                        r12.A00 = true;
                        C835248t A0L2 = r14.A0L(41);
                        if (A0L2 != null) {
                            C152057Xj r02 = new C152057Xj();
                            r02.A05(r15, 0);
                            C159377lj.A01(r13, r14, C152057Xj.A00(r02, r13, 1), A0L2);
                        }
                    }
                    C835248t A0L3 = r14.A0L(42);
                    if (A0L3 != null) {
                        C152057Xj r03 = new C152057Xj();
                        r03.A05(r15, 0);
                        C159377lj.A01(r13, r14, C152057Xj.A00(r03, r13, 1), A0L3);
                        return;
                    }
                    return;
                } else {
                    if (i2 == 15833) {
                        AnonymousClass0NT r7 = new AnonymousClass0NT(view);
                        AnonymousClass02N r5 = new AnonymousClass02N(view, r7, r8, r9, r10);
                        Context context = r13.A00;
                        GestureDetector gestureDetector = new GestureDetector(context, r5);
                        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, r5);
                        int i3 = Build.VERSION.SDK_INT;
                        scaleGestureDetector.setQuickScaleEnabled(false);
                        if (i3 >= 23) {
                            scaleGestureDetector.setStylusScaleEnabled(false);
                        }
                        r0 = new C07160aQ(gestureDetector, scaleGestureDetector, r7, r5);
                    } else if (i2 == 13313) {
                        AnonymousClass0LS r16 = (AnonymousClass0LS) C162377rs.A05(r13, r14);
                        if (r16 != null) {
                            r16.A00 = Integer.valueOf(view.getImportantForAccessibility());
                            r16.A01 = view.isFocusable();
                            boolean z2 = false;
                            if (!r14.A0W(35, true)) {
                                view.setImportantForAccessibility(2);
                                z = false;
                            } else {
                                z = true;
                            }
                            String A07 = AnonymousClass84O.A07(r14);
                            String str3 = (String) AnonymousClass84O.A05(r14, 38);
                            if (!(A07 == null && str3 == null)) {
                                z2 = true;
                            }
                            if (z || z2) {
                                view.setImportantForAccessibility(1);
                                view.setFocusable(true);
                            }
                            C06560Yg.A0O(view, new AnonymousClass060(r14));
                            AnonymousClass0S5.A01(r13, r15, r14.A0S(45));
                            return;
                        }
                        return;
                    } else if (i2 == 14001) {
                        AnonymousClass0VW.A00(view, r13, r14, r15);
                        return;
                    } else if (i2 == 13768) {
                        BKBloksComponentsBKSTextInputFormatterBinderUtil.bind(view, r13, r14, r15);
                        return;
                    } else if (i2 == 13981) {
                        r0 = new C07170aR(r13, r14, r15);
                    } else if (i2 == 13774) {
                        AnonymousClass0LU r4 = (AnonymousClass0LU) C162377rs.A05(r13, r14);
                        if (r4 != null && r4.A00 == null) {
                            Context context2 = r13.A00;
                            Activity A00 = C154157ch.A00(context2);
                            if (A00 != null) {
                                rootView = A00.findViewById(16908290);
                            } else {
                                rootView = view.getRootView();
                            }
                            C07230aX r22 = new C07230aX(rootView, r4.A01);
                            r22.A03.add(new AnonymousClass0Pi(context2, r13, r14, r15));
                            r4.A00 = r22;
                            return;
                        }
                        return;
                    } else if (i2 == 13656) {
                        C162457s7.A0J(view, 0);
                        SparseArray sparseArray = r13.A01;
                        view.setTag(R.id.render_lifecycle_extension_runnable, A00(sparseArray, new C13080mb(view, r13, r15, r9, (Runnable) sparseArray.get(R.id.bloks_surface_on_data_rendered_runnable))));
                        return;
                    } else if (i2 == 16529) {
                        C162457s7.A0J(view, 0);
                        SparseArray sparseArray2 = r13.A01;
                        Object A053 = C162377rs.A05(r13, r14);
                        A053.getClass();
                        AnonymousClass0LV r72 = (AnonymousClass0LV) A053;
                        r72.A00 = A00(sparseArray2, new C13090mc(r72, r8, r9, r10, (Runnable) sparseArray2.get(R.id.bloks_surface_on_data_rendered_runnable)));
                        return;
                    } else if (i2 == 13337) {
                        C162457s7.A0J(view, 0);
                        if ((view instanceof EditText) && (editText = (EditText) view) != null && (r2 = (AnonymousClass0Zt) C162377rs.A05(r13, r14)) != null) {
                            r2.A00 = editText;
                            String A06 = AnonymousClass84O.A06(r14);
                            if (A06 != null) {
                                if (!r2.A01.equals(A06)) {
                                    r2.A01 = A06;
                                    r2.A00();
                                    EditText editText2 = r2.A00;
                                    if (!(editText2 == null || editText2.getEditableText() == null)) {
                                        r2.afterTextChanged(r2.A00.getEditableText());
                                    }
                                }
                                C04080Ms r17 = (C04080Ms) C162377rs.A05(r13, r15);
                                if (r17 != null) {
                                    AnonymousClass0Zs r04 = r17.A0M;
                                    if (r04 != null) {
                                        r04.A05.remove(r2);
                                    }
                                    AnonymousClass0Zs r05 = r17.A0M;
                                    if (r05 != null) {
                                        r05.A05.add(r2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            throw AnonymousClass001.A0c("Required value was null.");
                        }
                        return;
                    } else {
                        if (i2 == 16515) {
                            C162457s7.A0J(view, 0);
                            int A0E = r14.A0E(35, Integer.MIN_VALUE);
                            if (A0E == Integer.MIN_VALUE) {
                                str = "BloksViewTagExtension";
                                str2 = "ViewTagExtension is used, but no actual tag value is provided or FALLBACK_INT_TAG is found. This redundantly forces parent component for have a View";
                            } else {
                                i = R.id.bk_extension_viewtag_int;
                                valueOf = Integer.valueOf(A0E);
                            }
                        } else if (i2 == 13688) {
                            C170348Cv r3 = (C170348Cv) C162377rs.A05(r13, r14);
                            if (r3 == null) {
                                str = "ViewTransformsExtensionBinderUtils";
                                str2 = "Null controller while binding ViewTransformsExtension";
                            } else {
                                r3.A0B = view;
                                view.setAlpha(r3.A00);
                                view.setRotation(r3.A04);
                                view.setRotationX(r3.A05);
                                view.setRotationY(r3.A06);
                                Context context3 = r13.A00;
                                float f = r3.A01;
                                if (f == 0.0f) {
                                    f = 2.14748365E9f;
                                }
                                float A002 = C86604Kt.A00(context3);
                                view.setCameraDistance(A002 * A002 * (-f) * C159747mO.A00);
                                view.setScaleX(r3.A07);
                                view.setScaleY(r3.A08);
                                r3.A0D = true;
                                r3.A0C = new C1893691a(view, 0, r3);
                                view.getViewTreeObserver().addOnPreDrawListener(r3.A0C);
                                return;
                            }
                        } else {
                            Object[] A0L4 = AnonymousClass002.A0L();
                            C18270x1.A1Q(A0L4, i2);
                            throw AnonymousClass6C7.A0W("No implementation bound to key: %s", A0L4);
                        }
                        C159737mN.A01(str, str2);
                        return;
                    }
                    view.setOnTouchListener(r0);
                    return;
                }
                view.setTag(i, valueOf);
            } else if (r15.A03 != 13323) {
                Log.e("invalid_extension_used", "bk.components.AvatarImageExtension should only be used for image components");
            } else {
                float A0B = r14.A0B(35, 1.0f);
                float A0B2 = r14.A0B(38, 0.0f);
                view.setScaleX(A0B);
                view.setScaleY(A0B);
                view.setTranslationY(C86664Kz.A02(view) * A0B2 * A0B);
                C07110aL r18 = new C07110aL(A0B, A0B2);
                view.addOnLayoutChangeListener(r18);
                C03480Kh r06 = (C03480Kh) C162377rs.A05(r13, r14);
                if (r06 != null) {
                    r06.A00 = r18;
                }
            }
        }
    }

    public static C71703cX A00(SparseArray sparseArray, Runnable runnable) {
        C71703cX r2 = new C71703cX(runnable);
        C156837hI r1 = (C156837hI) sparseArray.get(R.id.bk_context_key_render_callback_queue);
        if (r1 != null && C161827qc.A04() && !r1.A00 && !r1.A01) {
            LinkedList linkedList = r1.A04;
            linkedList.isEmpty();
            linkedList.add(r2);
        }
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x012d, code lost:
        if (X.AnonymousClass6C9.A1P(r1) != false) goto L_0x012f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A02(X.C153427bI r8, X.AnonymousClass84O r9) {
        /*
            r7 = this;
            int r2 = r9.A03
            boolean r0 = A01(r2)
            if (r0 == 0) goto L_0x0153
            r0 = 13762(0x35c2, float:1.9285E-41)
            if (r2 != r0) goto L_0x0012
            X.0Kh r5 = new X.0Kh
            r5.<init>()
        L_0x0011:
            return r5
        L_0x0012:
            r0 = 13566(0x34fe, float:1.901E-41)
            if (r2 == r0) goto L_0x0153
            r0 = 16310(0x3fb6, float:2.2855E-41)
            if (r2 != r0) goto L_0x0020
            X.0Nk r5 = new X.0Nk
            r5.<init>(r8, r9)
            return r5
        L_0x0020:
            r0 = 13914(0x365a, float:1.9498E-41)
            if (r2 != r0) goto L_0x002a
            X.0Ko r5 = new X.0Ko
            r5.<init>()
            return r5
        L_0x002a:
            r0 = 15833(0x3dd9, float:2.2187E-41)
            if (r2 == r0) goto L_0x0153
            r0 = 13313(0x3401, float:1.8655E-41)
            if (r2 != r0) goto L_0x0038
            X.0LS r5 = new X.0LS
            r5.<init>()
            return r5
        L_0x0038:
            r0 = 14001(0x36b1, float:1.962E-41)
            if (r2 != r0) goto L_0x0042
            X.0Ml r5 = new X.0Ml
            r5.<init>()
            return r5
        L_0x0042:
            r0 = 13768(0x35c8, float:1.9293E-41)
            if (r2 != r0) goto L_0x004b
            com.bloks.stdlib.components.bkcomponentsbkstextinputformatter.ExpressionMask r5 = com.bloks.stdlib.components.bkcomponentsbkstextinputformatter.BKBloksComponentsBKSTextInputFormatterBinderUtil.createController(r8, r9)
            return r5
        L_0x004b:
            r0 = 13981(0x369d, float:1.9592E-41)
            if (r2 != r0) goto L_0x0055
            X.0Ks r5 = new X.0Ks
            r5.<init>()
            return r5
        L_0x0055:
            r0 = 13774(0x35ce, float:1.9301E-41)
            if (r2 != r0) goto L_0x005f
            X.0LU r5 = new X.0LU
            r5.<init>()
            return r5
        L_0x005f:
            r0 = 13656(0x3558, float:1.9136E-41)
            if (r2 == r0) goto L_0x0153
            r0 = 16529(0x4091, float:2.3162E-41)
            if (r2 != r0) goto L_0x006d
            X.0LV r5 = new X.0LV
            r5.<init>()
            return r5
        L_0x006d:
            r0 = 13337(0x3419, float:1.8689E-41)
            if (r2 != r0) goto L_0x0085
            java.lang.String r1 = X.AnonymousClass84O.A06(r9)
            r5 = 0
            if (r1 == 0) goto L_0x0011
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0011
            r0 = 0
            X.0Zt r5 = new X.0Zt
            r5.<init>(r0, r1)
            return r5
        L_0x0085:
            r0 = 16515(0x4083, float:2.3142E-41)
            if (r2 == r0) goto L_0x0153
            r0 = 13688(0x3578, float:1.9181E-41)
            if (r2 != r0) goto L_0x0145
            java.lang.String r6 = "ViewTransformsExtensionBinderUtils"
            X.8Cv r5 = new X.8Cv
            r5.<init>()
            r0 = 141(0x8d, float:1.98E-43)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = r9.A0B(r0, r3)
            r5.A00 = r0
            r4 = 0
            r2 = 0
            r0 = 38
            java.lang.Object r0 = X.AnonymousClass84O.A05(r9, r0)     // Catch:{ 6u2 -> 0x00c1 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ 6u2 -> 0x00c1 }
            if (r0 != 0) goto L_0x00ac
            r0 = 0
            goto L_0x00b0
        L_0x00ac:
            float r0 = X.C162407s0.A01(r0)     // Catch:{ 6u2 -> 0x00c1 }
        L_0x00b0:
            r5.A09 = r0     // Catch:{ 6u2 -> 0x00c1 }
            java.lang.String r0 = X.AnonymousClass84O.A08(r9)     // Catch:{ 6u2 -> 0x00c1 }
            if (r0 != 0) goto L_0x00ba
            r0 = 0
            goto L_0x00be
        L_0x00ba:
            float r0 = X.C162407s0.A01(r0)     // Catch:{ 6u2 -> 0x00c1 }
        L_0x00be:
            r5.A0A = r0     // Catch:{ 6u2 -> 0x00c1 }
            goto L_0x00c7
        L_0x00c1:
            r1 = move-exception
            java.lang.String r0 = "Could not parse translation value."
            X.C159737mN.A00(r4, r6, r0, r1)
        L_0x00c7:
            r0 = 35
            float r0 = r9.A0B(r0, r3)
            r5.A07 = r0
            r0 = 36
            float r0 = r9.A0B(r0, r3)
            r5.A08 = r0
            r0 = 138(0x8a, float:1.93E-43)
            float r0 = r9.A0B(r0, r2)
            r5.A04 = r0
            r0 = 44
            float r0 = r9.A0B(r0, r2)
            r5.A05 = r0
            r0 = 45
            float r0 = r9.A0B(r0, r2)
            r5.A06 = r0
            r1 = 43
            r0 = 1151336448(0x44a00000, float:1280.0)
            float r0 = r9.A0B(r1, r0)
            r5.A01 = r0
            r0 = 41
            java.lang.Object r1 = X.AnonymousClass84O.A05(r9, r0)     // Catch:{ 6u2 -> 0x013e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 6u2 -> 0x013e }
            r0 = 42
            java.lang.Object r3 = X.AnonymousClass84O.A05(r9, r0)     // Catch:{ 6u2 -> 0x013e }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ 6u2 -> 0x013e }
            if (r1 != 0) goto L_0x010d
            if (r3 == 0) goto L_0x0011
        L_0x010d:
            r2 = 1
            r5.A0E = r2     // Catch:{ 6u2 -> 0x013e }
            if (r1 != 0) goto L_0x0115
            r0 = 1112014848(0x42480000, float:50.0)
            goto L_0x0119
        L_0x0115:
            float r0 = X.C162407s0.A01(r1)     // Catch:{ 6u2 -> 0x013e }
        L_0x0119:
            r5.A02 = r0     // Catch:{ 6u2 -> 0x013e }
            if (r3 != 0) goto L_0x0120
            r0 = 1112014848(0x42480000, float:50.0)
            goto L_0x0124
        L_0x0120:
            float r0 = X.C162407s0.A01(r3)     // Catch:{ 6u2 -> 0x013e }
        L_0x0124:
            r5.A03 = r0     // Catch:{ 6u2 -> 0x013e }
            if (r1 == 0) goto L_0x012f
            boolean r1 = X.AnonymousClass6C9.A1P(r1)     // Catch:{ 6u2 -> 0x013e }
            r0 = 0
            if (r1 == 0) goto L_0x0130
        L_0x012f:
            r0 = 1
        L_0x0130:
            r5.A0F = r0     // Catch:{ 6u2 -> 0x013e }
            if (r3 == 0) goto L_0x013b
            boolean r0 = X.AnonymousClass6C9.A1P(r3)     // Catch:{ 6u2 -> 0x013e }
            if (r0 != 0) goto L_0x013b
            r2 = 0
        L_0x013b:
            r5.A0G = r2     // Catch:{ 6u2 -> 0x013e }
            return r5
        L_0x013e:
            r1 = move-exception
            java.lang.String r0 = "Could not parse pivot value."
            X.C159737mN.A00(r4, r6, r0, r1)
            return r5
        L_0x0145:
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            X.C18270x1.A1Q(r1, r2)
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6C7.A0W(r0, r1)
            throw r0
        L_0x0153:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161897qn.A02(X.7bI, X.84O):java.lang.Object");
    }

    public void A04(C153427bI r6, AnonymousClass84O r7, AnonymousClass84O r8, Object obj) {
        int i;
        AnonymousClass0Zs r0;
        Runnable runnable;
        int i2 = r7.A03;
        if (A01(i2)) {
            View view = (View) obj;
            if (i2 == 13762) {
                C03480Kh r02 = (C03480Kh) C162377rs.A05(r6, r7);
                if (r02 != null) {
                    view.removeOnLayoutChangeListener(r02.A00);
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    view.setTranslationY(0.0f);
                    return;
                }
                return;
            }
            if (i2 == 13566) {
                i = R.id.testing_id_view_tag_key;
            } else if (i2 == 16310) {
                Object A05 = C162377rs.A05(r6, r7);
                A05.getClass();
                C03270Jm.A00.post(((C04250Nk) A05).A04);
                return;
            } else if (i2 == 13914) {
                C835248t A0L = r7.A0L(43);
                if (A0L != null) {
                    C159377lj.A01(r6, r7, C152057Xj.A02(r8), A0L);
                    return;
                }
                return;
            } else {
                if (i2 != 15833) {
                    if (i2 == 13313) {
                        AnonymousClass0LS r1 = (AnonymousClass0LS) C162377rs.A05(r6, r7);
                        if (r1 != null) {
                            C06560Yg.A0O(view, (AnonymousClass0WH) null);
                            view.setImportantForAccessibility(r1.A00.intValue());
                            view.setFocusable(r1.A01);
                            AnonymousClass0S5.A00(r6, r8, r7.A0S(45));
                            return;
                        }
                        return;
                    } else if (i2 == 14001) {
                        C04010Ml r4 = (C04010Ml) C162377rs.A05(r6, r7);
                        if (r4 != null) {
                            C06560Yg.A0O(view, (AnonymousClass0WH) null);
                            view.setContentDescription(r4.A03);
                            view.setImportantForAccessibility(r4.A00.intValue());
                            C06360Xi.A01(view, r4.A01.intValue());
                            view.setFocusable(r4.A05);
                            view.setSelected(r4.A08);
                            view.setEnabled(r4.A04);
                            C06560Yg.A0T(view, r4.A06);
                            new C17560vm(0).A03(view, Boolean.valueOf(r4.A07));
                            if (r4.A09) {
                                view.setOnClickListener((View.OnClickListener) null);
                            }
                            if (r4.A0A) {
                                view.setOnClickListener((View.OnClickListener) null);
                            }
                            AnonymousClass0S5.A00(r6, r8, r7.A0S(56));
                            AnonymousClass0YH.A05(view, -1);
                            return;
                        }
                        return;
                    } else if (i2 == 13768) {
                        BKBloksComponentsBKSTextInputFormatterBinderUtil.unbind(view, r6, r7, r8);
                        return;
                    } else if (i2 != 13981) {
                        if (i2 == 13774) {
                            AnonymousClass0LU r2 = (AnonymousClass0LU) C162377rs.A05(r6, r7);
                            if (r2 != null) {
                                C07230aX r12 = r2.A00;
                                if (r12 == null) {
                                    r2.A01 = false;
                                    return;
                                }
                                r2.A01 = r12.A00;
                                r12.A03.clear();
                                ViewTreeObserver viewTreeObserver = r12.A02.getViewTreeObserver();
                                if (viewTreeObserver != null) {
                                    viewTreeObserver.removeOnGlobalLayoutListener(r12);
                                }
                                r2.A00 = null;
                                return;
                            }
                            return;
                        }
                        if (i2 == 13656) {
                            C162457s7.A0J(view, 0);
                            runnable = (Runnable) view.getTag(R.id.render_lifecycle_extension_runnable);
                        } else if (i2 == 16529) {
                            C162457s7.A0J(view, 0);
                            Object A052 = C162377rs.A05(r6, r7);
                            A052.getClass();
                            runnable = ((AnonymousClass0LV) A052).A00;
                        } else if (i2 == 13337) {
                            AnonymousClass0Zt r13 = (AnonymousClass0Zt) C162377rs.A05(r6, r7);
                            if (r13 != null) {
                                r13.A00 = null;
                                C04080Ms r03 = (C04080Ms) C162377rs.A05(r6, r8);
                                if (r03 != null && (r0 = r03.A0M) != null) {
                                    r0.A05.remove(r13);
                                    return;
                                }
                                return;
                            }
                            return;
                        } else if (i2 == 16515) {
                            C162457s7.A0J(view, 0);
                            i = R.id.bk_extension_viewtag_int;
                        } else if (i2 == 13688) {
                            C159747mO.A00(view, r6, r7);
                            return;
                        } else {
                            Object[] A0L2 = AnonymousClass002.A0L();
                            C18270x1.A1Q(A0L2, i2);
                            throw AnonymousClass6C7.A0W("No implementation bound to key: %s", A0L2);
                        }
                        if (runnable instanceof C71703cX) {
                            C71703cX r14 = (C71703cX) runnable;
                            if (r14.A02 == 3) {
                                r14.A01 = true;
                                return;
                            }
                        }
                        view.removeCallbacks(runnable);
                        return;
                    }
                }
                view.setOnTouchListener((View.OnTouchListener) null);
                return;
            }
            view.setTag(i, (Object) null);
        }
    }

    public static boolean A01(int i) {
        switch (i) {
            case 13313:
            case 13337:
            case 13566:
            case 13656:
            case 13688:
            case 13762:
            case 13768:
            case 13774:
            case 13914:
            case 13981:
            case 14001:
            case 15833:
            case 16310:
            case 16515:
            case 16529:
                return true;
            default:
                return false;
        }
    }
}
