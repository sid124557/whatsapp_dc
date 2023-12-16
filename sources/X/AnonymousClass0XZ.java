package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.0XZ  reason: invalid class name */
public class AnonymousClass0XZ {
    public static SparseIntArray A02;
    public static final int[] A03 = {0, 4, 8};
    public HashMap A00 = AnonymousClass001.A0t();
    public HashMap A01 = AnonymousClass001.A0t();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A02 = sparseIntArray;
        A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(sparseIntArray, 76, 25), 77, 26), 79, 29), 80, 30), 86, 36), 85, 35), 58, 4), 57, 3), 55, 1), 94, 6), 95, 7), 65, 17), 66, 18), 67, 19), 0, 27), 81, 32), 82, 33), 64, 10), 63, 9), 98, 13), 101, 16), 99, 14), 96, 11), 100, 15), 97, 12), 89, 40), 74, 39), 73, 41), 88, 42), 72, 20), 87, 37), 62, 5), 75, 82), 84, 82), 78, 82), 56, 82), 54, 82), 5, 24), 7, 28), 23, 31), 24, 8), 6, 34), 8, 2), 3, 23), 4, 21), 2, 22), 13, 43), 26, 44), 21, 45), 22, 46), 20, 60), 18, 47), 19, 48), 14, 49), 15, 50), 16, 51), 17, 52), 25, 53), 90, 54), 68, 55), 91, 56), 69, 57), 92, 58), 70, 59), 59, 61), 61, 62), 60, 63), 27, 64), 106, 65), 33, 66), 107, 67), 103, 79), 1, 38), 102, 68), 93, 69), 71, 70), 31, 71), 29, 72), 30, 73), 32, 74), 28, 75), 104, 76), 83, 77), C627136h.A03, 78), 53, 80).append(52, 81);
    }

    public void A07(int i) {
        A04(i).A02.A03 = 0.0f;
    }

    public static final int[] A03(View view, String str) {
        int i;
        Object obj;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = view.getContext();
        int length = split.length;
        int[] iArr = new int[length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String trim = split[i2].trim();
            try {
                i = AnonymousClass0H8.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, PublicKeyCredentialControllerUtility.JSON_KEY_ID, context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view.getParent();
                if (trim == null || (hashMap = constraintLayout.A0E) == null || !hashMap.containsKey(trim)) {
                    obj = null;
                } else {
                    obj = constraintLayout.A0E.get(trim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = AnonymousClass001.A0K(obj);
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    public final C04430Oe A04(int i) {
        HashMap hashMap = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(valueOf, new C04430Oe());
        }
        return (C04430Oe) hashMap.get(valueOf);
    }

    public final C04430Oe A05(Context context, AttributeSet attributeSet) {
        String str;
        StringBuilder A0o;
        String str2;
        C04430Oe r4 = new C04430Oe();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0K9.A00);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (!(index == 1 || 23 == index || 24 == index)) {
                r4.A03.A06 = true;
                r4.A02.A0w = true;
                r4.A04.A04 = true;
                r4.A05.A0C = true;
            }
            SparseIntArray sparseIntArray = A02;
            switch (sparseIntArray.get(index)) {
                case 1:
                    AnonymousClass0TP r1 = r4.A02;
                    r1.A08 = A00(obtainStyledAttributes, index, r1.A08);
                    continue;
                case 2:
                    AnonymousClass0TP r12 = r4.A02;
                    r12.A09 = obtainStyledAttributes.getDimensionPixelSize(index, r12.A09);
                    continue;
                case 3:
                    AnonymousClass0TP r13 = r4.A02;
                    r13.A0A = A00(obtainStyledAttributes, index, r13.A0A);
                    continue;
                case 4:
                    AnonymousClass0TP r14 = r4.A02;
                    r14.A0B = A00(obtainStyledAttributes, index, r14.A0B);
                    continue;
                case 5:
                    r4.A02.A0r = obtainStyledAttributes.getString(index);
                    continue;
                case 6:
                    AnonymousClass0TP r15 = r4.A02;
                    r15.A0E = obtainStyledAttributes.getDimensionPixelOffset(index, r15.A0E);
                    continue;
                case 7:
                    AnonymousClass0TP r16 = r4.A02;
                    r16.A0F = obtainStyledAttributes.getDimensionPixelOffset(index, r16.A0F);
                    continue;
                case 8:
                    AnonymousClass0TP r17 = r4.A02;
                    r17.A0G = obtainStyledAttributes.getDimensionPixelSize(index, r17.A0G);
                    continue;
                case 9:
                    AnonymousClass0TP r18 = r4.A02;
                    r18.A0H = A00(obtainStyledAttributes, index, r18.A0H);
                    continue;
                case 10:
                    AnonymousClass0TP r19 = r4.A02;
                    r19.A0I = A00(obtainStyledAttributes, index, r19.A0I);
                    continue;
                case 11:
                    AnonymousClass0TP r110 = r4.A02;
                    r110.A0J = obtainStyledAttributes.getDimensionPixelSize(index, r110.A0J);
                    continue;
                case 12:
                    AnonymousClass0TP r111 = r4.A02;
                    r111.A0K = obtainStyledAttributes.getDimensionPixelSize(index, r111.A0K);
                    continue;
                case 13:
                    AnonymousClass0TP r112 = r4.A02;
                    r112.A0L = obtainStyledAttributes.getDimensionPixelSize(index, r112.A0L);
                    continue;
                case 14:
                    AnonymousClass0TP r113 = r4.A02;
                    r113.A0M = obtainStyledAttributes.getDimensionPixelSize(index, r113.A0M);
                    continue;
                case 15:
                    AnonymousClass0TP r114 = r4.A02;
                    r114.A0N = obtainStyledAttributes.getDimensionPixelSize(index, r114.A0N);
                    continue;
                case 16:
                    AnonymousClass0TP r115 = r4.A02;
                    r115.A0O = obtainStyledAttributes.getDimensionPixelSize(index, r115.A0O);
                    continue;
                case 17:
                    AnonymousClass0TP r116 = r4.A02;
                    r116.A0P = obtainStyledAttributes.getDimensionPixelOffset(index, r116.A0P);
                    continue;
                case 18:
                    AnonymousClass0TP r117 = r4.A02;
                    r117.A0Q = obtainStyledAttributes.getDimensionPixelOffset(index, r117.A0Q);
                    continue;
                case 19:
                    AnonymousClass0TP r118 = r4.A02;
                    r118.A01 = obtainStyledAttributes.getFloat(index, r118.A01);
                    continue;
                case 20:
                    AnonymousClass0TP r119 = r4.A02;
                    r119.A03 = obtainStyledAttributes.getFloat(index, r119.A03);
                    continue;
                case 21:
                    AnonymousClass0TP r120 = r4.A02;
                    r120.A0a = obtainStyledAttributes.getLayoutDimension(index, r120.A0a);
                    continue;
                case 22:
                    AnonymousClass0MI r8 = r4.A04;
                    int i2 = obtainStyledAttributes.getInt(index, r8.A03);
                    r8.A03 = i2;
                    r8.A03 = A03[i2];
                    continue;
                case 23:
                    AnonymousClass0TP r121 = r4.A02;
                    r121.A0c = obtainStyledAttributes.getLayoutDimension(index, r121.A0c);
                    continue;
                case 24:
                    AnonymousClass0TP r122 = r4.A02;
                    r122.A0V = obtainStyledAttributes.getDimensionPixelSize(index, r122.A0V);
                    continue;
                case 25:
                    AnonymousClass0TP r123 = r4.A02;
                    r123.A0W = A00(obtainStyledAttributes, index, r123.A0W);
                    continue;
                case 26:
                    AnonymousClass0TP r124 = r4.A02;
                    r124.A0X = A00(obtainStyledAttributes, index, r124.A0X);
                    continue;
                case 27:
                    AnonymousClass0TP r125 = r4.A02;
                    r125.A0d = obtainStyledAttributes.getInt(index, r125.A0d);
                    continue;
                case 28:
                    AnonymousClass0TP r126 = r4.A02;
                    r126.A0e = obtainStyledAttributes.getDimensionPixelSize(index, r126.A0e);
                    continue;
                case 29:
                    AnonymousClass0TP r127 = r4.A02;
                    r127.A0f = A00(obtainStyledAttributes, index, r127.A0f);
                    continue;
                case 30:
                    AnonymousClass0TP r128 = r4.A02;
                    r128.A0g = A00(obtainStyledAttributes, index, r128.A0g);
                    continue;
                case 31:
                    AnonymousClass0TP r129 = r4.A02;
                    r129.A0h = obtainStyledAttributes.getDimensionPixelSize(index, r129.A0h);
                    continue;
                case 32:
                    AnonymousClass0TP r130 = r4.A02;
                    r130.A0i = A00(obtainStyledAttributes, index, r130.A0i);
                    continue;
                case 33:
                    AnonymousClass0TP r131 = r4.A02;
                    r131.A0j = A00(obtainStyledAttributes, index, r131.A0j);
                    continue;
                case 34:
                    AnonymousClass0TP r132 = r4.A02;
                    r132.A0k = obtainStyledAttributes.getDimensionPixelSize(index, r132.A0k);
                    continue;
                case 35:
                    AnonymousClass0TP r133 = r4.A02;
                    r133.A0l = A00(obtainStyledAttributes, index, r133.A0l);
                    continue;
                case 36:
                    AnonymousClass0TP r134 = r4.A02;
                    r134.A0m = A00(obtainStyledAttributes, index, r134.A0m);
                    continue;
                case 37:
                    AnonymousClass0TP r135 = r4.A02;
                    r135.A05 = obtainStyledAttributes.getFloat(index, r135.A05);
                    continue;
                case 38:
                    r4.A00 = obtainStyledAttributes.getResourceId(index, r4.A00);
                    continue;
                case 39:
                    AnonymousClass0TP r136 = r4.A02;
                    r136.A04 = obtainStyledAttributes.getFloat(index, r136.A04);
                    continue;
                case 40:
                    AnonymousClass0TP r137 = r4.A02;
                    r137.A06 = obtainStyledAttributes.getFloat(index, r137.A06);
                    continue;
                case 41:
                    AnonymousClass0TP r138 = r4.A02;
                    r138.A0U = obtainStyledAttributes.getInt(index, r138.A0U);
                    continue;
                case 42:
                    AnonymousClass0TP r139 = r4.A02;
                    r139.A0n = obtainStyledAttributes.getInt(index, r139.A0n);
                    continue;
                case 43:
                    AnonymousClass0MI r140 = r4.A04;
                    r140.A00 = obtainStyledAttributes.getFloat(index, r140.A00);
                    continue;
                case 44:
                    AnonymousClass0TO r141 = r4.A05;
                    r141.A0B = true;
                    r141.A00 = obtainStyledAttributes.getDimension(index, r141.A00);
                    continue;
                case 45:
                    AnonymousClass0TO r142 = r4.A05;
                    r142.A02 = obtainStyledAttributes.getFloat(index, r142.A02);
                    continue;
                case 46:
                    AnonymousClass0TO r143 = r4.A05;
                    r143.A03 = obtainStyledAttributes.getFloat(index, r143.A03);
                    continue;
                case 47:
                    AnonymousClass0TO r144 = r4.A05;
                    r144.A04 = obtainStyledAttributes.getFloat(index, r144.A04);
                    continue;
                case 48:
                    AnonymousClass0TO r145 = r4.A05;
                    r145.A05 = obtainStyledAttributes.getFloat(index, r145.A05);
                    continue;
                case 49:
                    AnonymousClass0TO r146 = r4.A05;
                    r146.A06 = obtainStyledAttributes.getDimension(index, r146.A06);
                    continue;
                case 50:
                    AnonymousClass0TO r147 = r4.A05;
                    r147.A07 = obtainStyledAttributes.getDimension(index, r147.A07);
                    continue;
                case 51:
                    AnonymousClass0TO r148 = r4.A05;
                    r148.A08 = obtainStyledAttributes.getDimension(index, r148.A08);
                    continue;
                case AnonymousClass1ES.REVOKE_MESSAGE_TIMESTAMP_FIELD_NUMBER /*52*/:
                    AnonymousClass0TO r149 = r4.A05;
                    r149.A09 = obtainStyledAttributes.getDimension(index, r149.A09);
                    continue;
                case 53:
                    AnonymousClass0TO r150 = r4.A05;
                    r150.A0A = obtainStyledAttributes.getDimension(index, r150.A0A);
                    continue;
                case 54:
                    AnonymousClass0TP r151 = r4.A02;
                    r151.A0o = obtainStyledAttributes.getInt(index, r151.A0o);
                    continue;
                case 55:
                    AnonymousClass0TP r152 = r4.A02;
                    r152.A0R = obtainStyledAttributes.getInt(index, r152.A0R);
                    continue;
                case 56:
                    AnonymousClass0TP r153 = r4.A02;
                    r153.A0p = obtainStyledAttributes.getDimensionPixelSize(index, r153.A0p);
                    continue;
                case AnonymousClass1ES.IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER /*57*/:
                    AnonymousClass0TP r154 = r4.A02;
                    r154.A0S = obtainStyledAttributes.getDimensionPixelSize(index, r154.A0S);
                    continue;
                case 58:
                    AnonymousClass0TP r155 = r4.A02;
                    r155.A0q = obtainStyledAttributes.getDimensionPixelSize(index, r155.A0q);
                    continue;
                case 59:
                    AnonymousClass0TP r156 = r4.A02;
                    r156.A0T = obtainStyledAttributes.getDimensionPixelSize(index, r156.A0T);
                    continue;
                case AnonymousClass1EU.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER /*60*/:
                    AnonymousClass0TO r157 = r4.A05;
                    r157.A01 = obtainStyledAttributes.getFloat(index, r157.A01);
                    continue;
                case 61:
                    AnonymousClass0TP r158 = r4.A02;
                    r158.A0C = A00(obtainStyledAttributes, index, r158.A0C);
                    continue;
                case 62:
                    AnonymousClass0TP r159 = r4.A02;
                    r159.A0D = obtainStyledAttributes.getDimensionPixelSize(index, r159.A0D);
                    continue;
                case 63:
                    AnonymousClass0TP r160 = r4.A02;
                    r160.A00 = obtainStyledAttributes.getFloat(index, r160.A00);
                    continue;
                case AnonymousClass1EU.POLL_CREATION_MESSAGE_V3_FIELD_NUMBER /*64*/:
                    AnonymousClass0TL r161 = r4.A03;
                    r161.A02 = A00(obtainStyledAttributes, index, r161.A02);
                    continue;
                case AnonymousClass1EU.SCHEDULED_CALL_EDIT_MESSAGE_FIELD_NUMBER /*65*/:
                    int i3 = obtainStyledAttributes.peekValue(index).type;
                    AnonymousClass0TL r82 = r4.A03;
                    if (i3 == 3) {
                        str = obtainStyledAttributes.getString(index);
                    } else {
                        str = AnonymousClass0JS.A00[obtainStyledAttributes.getInteger(index, 0)];
                    }
                    r82.A05 = str;
                    continue;
                case AnonymousClass1EU.PTV_MESSAGE_FIELD_NUMBER /*66*/:
                    r4.A03.A03 = obtainStyledAttributes.getInt(index, 0);
                    continue;
                case AnonymousClass1EU.BOT_INVOKE_MESSAGE_FIELD_NUMBER /*67*/:
                    AnonymousClass0TL r162 = r4.A03;
                    r162.A01 = obtainStyledAttributes.getFloat(index, r162.A01);
                    continue;
                case 68:
                    AnonymousClass0MI r163 = r4.A04;
                    r163.A01 = obtainStyledAttributes.getFloat(index, r163.A01);
                    continue;
                case AnonymousClass1EU.CALL_LOG_MESSSAGE_FIELD_NUMBER /*69*/:
                    r4.A02.A07 = obtainStyledAttributes.getFloat(index, 1.0f);
                    continue;
                case AnonymousClass1EU.MESSAGE_HISTORY_BUNDLE_FIELD_NUMBER /*70*/:
                    r4.A02.A02 = obtainStyledAttributes.getFloat(index, 1.0f);
                    continue;
                case AnonymousClass1EU.ENC_COMMENT_MESSAGE_FIELD_NUMBER /*71*/:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    AnonymousClass0TP r164 = r4.A02;
                    r164.A0Y = obtainStyledAttributes.getInt(index, r164.A0Y);
                    continue;
                case 73:
                    AnonymousClass0TP r165 = r4.A02;
                    r165.A0Z = obtainStyledAttributes.getDimensionPixelSize(index, r165.A0Z);
                    continue;
                case AnonymousClass1EU.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER /*74*/:
                    r4.A02.A0t = obtainStyledAttributes.getString(index);
                    continue;
                case AnonymousClass1EU.EVENT_MESSAGE_FIELD_NUMBER /*75*/:
                    AnonymousClass0TP r166 = r4.A02;
                    r166.A0x = obtainStyledAttributes.getBoolean(index, r166.A0x);
                    continue;
                case AnonymousClass1EU.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER /*76*/:
                    AnonymousClass0TL r167 = r4.A03;
                    r167.A04 = obtainStyledAttributes.getInt(index, r167.A04);
                    continue;
                case AnonymousClass1EU.COMMENT_MESSAGE_FIELD_NUMBER /*77*/:
                    r4.A02.A0s = obtainStyledAttributes.getString(index);
                    continue;
                case AnonymousClass1EU.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER /*78*/:
                    AnonymousClass0MI r168 = r4.A04;
                    r168.A02 = obtainStyledAttributes.getInt(index, r168.A02);
                    continue;
                case 79:
                    AnonymousClass0TL r169 = r4.A03;
                    r169.A00 = obtainStyledAttributes.getFloat(index, r169.A00);
                    continue;
                case 80:
                    AnonymousClass0TP r170 = r4.A02;
                    r170.A0v = obtainStyledAttributes.getBoolean(index, r170.A0v);
                    continue;
                case 81:
                    AnonymousClass0TP r171 = r4.A02;
                    r171.A0u = obtainStyledAttributes.getBoolean(index, r171.A0u);
                    continue;
                case 82:
                    A0o = AnonymousClass001.A0o();
                    str2 = "unused attribute 0x";
                    break;
                default:
                    A0o = AnonymousClass001.A0o();
                    str2 = "Unknown attribute 0x";
                    break;
            }
            AnonymousClass000.A1G(str2, A0o, index);
            A0o.append("   ");
            Log.w("ConstraintSet", AnonymousClass000.A0h(A0o, sparseIntArray.get(index)));
        }
        obtainStyledAttributes.recycle();
        return r4;
    }

    public void A08(int i, int i2, int i3, int i4) {
        AnonymousClass0TP r0;
        HashMap hashMap = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(valueOf, new C04430Oe());
        }
        C04430Oe r7 = (C04430Oe) hashMap.get(valueOf);
        switch (i2) {
            case 3:
                if (i4 == 3) {
                    r0 = r7.A02;
                    r0.A0m = i3;
                    r0.A0l = -1;
                    break;
                } else if (i4 == 4) {
                    r0 = r7.A02;
                    r0.A0l = i3;
                    r0.A0m = -1;
                    break;
                } else {
                    StringBuilder A0l = AnonymousClass000.A0l("right to ");
                    A0l.append(A02(i4));
                    throw AnonymousClass000.A0F(" undefined", A0l);
                }
            case 4:
                if (i4 == 4) {
                    r0 = r7.A02;
                    r0.A0A = i3;
                    r0.A0B = -1;
                    break;
                } else if (i4 == 3) {
                    r0 = r7.A02;
                    r0.A0B = i3;
                    r0.A0A = -1;
                    break;
                } else {
                    StringBuilder A0l2 = AnonymousClass000.A0l("right to ");
                    A0l2.append(A02(i4));
                    throw AnonymousClass000.A0F(" undefined", A0l2);
                }
            case 5:
                if (i4 == 5) {
                    AnonymousClass0TP r02 = r7.A02;
                    r02.A08 = i3;
                    r02.A0A = -1;
                    r02.A0B = -1;
                    r02.A0m = -1;
                    r02.A0l = -1;
                    return;
                }
                StringBuilder A0l3 = AnonymousClass000.A0l("right to ");
                A0l3.append(A02(i4));
                throw AnonymousClass000.A0F(" undefined", A0l3);
            case 6:
                if (i4 == 6) {
                    AnonymousClass0TP r03 = r7.A02;
                    r03.A0j = i3;
                    r03.A0i = -1;
                    return;
                } else if (i4 == 7) {
                    AnonymousClass0TP r04 = r7.A02;
                    r04.A0i = i3;
                    r04.A0j = -1;
                    return;
                } else {
                    StringBuilder A0l4 = AnonymousClass000.A0l("right to ");
                    A0l4.append(A02(i4));
                    throw AnonymousClass000.A0F(" undefined", A0l4);
                }
            default:
                if (i4 == 7) {
                    AnonymousClass0TP r05 = r7.A02;
                    r05.A0H = i3;
                    r05.A0I = -1;
                    return;
                } else if (i4 == 6) {
                    AnonymousClass0TP r06 = r7.A02;
                    r06.A0I = i3;
                    r06.A0H = -1;
                    return;
                } else {
                    StringBuilder A0l5 = AnonymousClass000.A0l("right to ");
                    A0l5.append(A02(i4));
                    throw AnonymousClass000.A0F(" undefined", A0l5);
                }
        }
        r0.A08 = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x014f, code lost:
        r13[0] = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0161, code lost:
        r14.invoke(r6, r13);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(androidx.constraintlayout.widget.ConstraintLayout r22) {
        /*
            r21 = this;
            r20 = r22
            int r18 = r20.getChildCount()
            r0 = r21
            java.util.HashMap r2 = r0.A00
            java.util.Set r1 = r2.keySet()
            java.util.HashSet r17 = new java.util.HashSet
            r0 = r17
            r0.<init>(r1)
            r4 = 0
        L_0x0016:
            r3 = 1
            r5 = -1
            r0 = r18
            if (r4 >= r0) goto L_0x021a
            r0 = r20
            android.view.View r6 = r0.getChildAt(r4)
            int r9 = r6.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            boolean r0 = r2.containsKey(r0)
            java.lang.String r7 = "ConstraintSet"
            if (r0 != 0) goto L_0x004d
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "id unknown "
            r3.append(r0)
            android.content.Context r0 = r6.getContext()     // Catch:{ Exception -> 0x020a }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ Exception -> 0x020a }
            int r0 = r6.getId()     // Catch:{ Exception -> 0x020a }
            java.lang.String r0 = r1.getResourceEntryName(r0)     // Catch:{ Exception -> 0x020a }
            goto L_0x020c
        L_0x004d:
            if (r9 == r5) goto L_0x0213
            if (r9 == r5) goto L_0x020f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            boolean r0 = r2.containsKey(r0)
            if (r0 == 0) goto L_0x01fc
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0 = r17
            r0.remove(r1)
            java.lang.Object r7 = r2.get(r1)
            X.0Oe r7 = (X.C04430Oe) r7
            boolean r0 = r6 instanceof androidx.constraintlayout.widget.Barrier
            if (r0 == 0) goto L_0x0072
            X.0TP r0 = r7.A02
            r0.A0b = r3
        L_0x0072:
            X.0TP r8 = r7.A02
            int r0 = r8.A0b
            if (r0 == r5) goto L_0x009f
            if (r0 != r3) goto L_0x009f
            r1 = r6
            androidx.constraintlayout.widget.Barrier r1 = (androidx.constraintlayout.widget.Barrier) r1
            r1.setId(r9)
            int r0 = r8.A0Y
            r1.A00 = r0
            int r0 = r8.A0Z
            r1.setMargin(r0)
            boolean r0 = r8.A0x
            r1.setAllowsGoneWidget(r0)
            int[] r0 = r8.A0z
            if (r0 != 0) goto L_0x009c
            java.lang.String r0 = r8.A0t
            if (r0 == 0) goto L_0x009f
            int[] r0 = A03(r1, r0)
            r8.A0z = r0
        L_0x009c:
            r1.setReferencedIds(r0)
        L_0x009f:
            android.view.ViewGroup$LayoutParams r10 = r6.getLayoutParams()
            X.02c r10 = (X.C001702c) r10
            r10.A03()
            r7.A00(r10)
            java.util.HashMap r0 = r7.A01
            r19 = r0
            java.lang.String r11 = "\" not found on "
            java.lang.String r9 = " Custom Attribute \""
            java.lang.String r8 = "TransitionLayout"
            java.lang.Class r5 = r6.getClass()
            java.util.Set r0 = r19.keySet()
            java.util.Iterator r16 = r0.iterator()
        L_0x00c1:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x019f
            java.lang.String r1 = X.AnonymousClass001.A0m(r16)
            r0 = r19
            java.lang.Object r0 = r0.get(r1)
            X.0Tj r0 = (X.C05450Tj) r0
            java.lang.StringBuilder r13 = X.AnonymousClass001.A0o()
            java.lang.String r12 = "set"
            java.lang.String r12 = X.AnonymousClass000.A0V(r12, r1, r13)
            X.0Fz r13 = r0.A03     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            int r13 = r13.ordinal()     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            r15 = 0
            switch(r13) {
                case 0: goto L_0x0112;
                case 1: goto L_0x0122;
                case 2: goto L_0x00e8;
                case 3: goto L_0x00f8;
                case 4: goto L_0x0132;
                case 5: goto L_0x013f;
                case 6: goto L_0x0152;
                default: goto L_0x00e7;
            }     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
        L_0x00e7:
            goto L_0x00c1
        L_0x00e8:
            java.lang.Class[] r14 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            java.lang.reflect.Method r14 = X.AnonymousClass001.A0r(r5, r13, r12, r14, r15)     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            int r0 = r0.A01     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            X.AnonymousClass000.A1P(r13, r0, r15)     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            goto L_0x0161
        L_0x00f8:
            java.lang.Class[] r14 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            java.lang.Class<android.graphics.drawable.Drawable> r13 = android.graphics.drawable.Drawable.class
            java.lang.reflect.Method r14 = X.AnonymousClass001.A0r(r5, r13, r12, r14, r15)     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            android.graphics.drawable.ColorDrawable r13 = new android.graphics.drawable.ColorDrawable     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            r13.<init>()     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            int r0 = r0.A01     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            r13.setColor(r0)     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            r0[r15] = r13     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            r14.invoke(r6, r0)     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            goto L_0x00c1
        L_0x0112:
            java.lang.Class[] r14 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            java.lang.reflect.Method r14 = X.AnonymousClass001.A0r(r5, r13, r12, r14, r15)     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            int r0 = r0.A02     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            X.AnonymousClass000.A1P(r13, r0, r15)     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            goto L_0x0161
        L_0x0122:
            java.lang.Class[] r14 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            java.lang.Class r13 = java.lang.Float.TYPE     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            java.lang.reflect.Method r14 = X.AnonymousClass001.A0r(r5, r13, r12, r14, r15)     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            float r0 = r0.A00     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            X.AnonymousClass001.A1P(r13, r0, r15)     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            goto L_0x0161
        L_0x0132:
            java.lang.Class[] r14 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            java.lang.Class<java.lang.CharSequence> r13 = java.lang.CharSequence.class
            java.lang.reflect.Method r14 = X.AnonymousClass001.A0r(r5, r13, r12, r14, r15)     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            java.lang.String r0 = r0.A05     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            goto L_0x014f
        L_0x013f:
            java.lang.Class[] r14 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            java.lang.Class r13 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            java.lang.reflect.Method r14 = X.AnonymousClass001.A0r(r5, r13, r12, r14, r15)     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            boolean r0 = r0.A06     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
        L_0x014f:
            r13[r15] = r0     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            goto L_0x0161
        L_0x0152:
            java.lang.Class[] r14 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            java.lang.Class r13 = java.lang.Float.TYPE     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            java.lang.reflect.Method r14 = X.AnonymousClass001.A0r(r5, r13, r12, r14, r15)     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            float r0 = r0.A00     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            X.AnonymousClass001.A1P(r13, r0, r15)     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
        L_0x0161:
            r14.invoke(r6, r13)     // Catch:{ NoSuchMethodException -> 0x017a, IllegalAccessException | InvocationTargetException -> 0x0166 }
            goto L_0x00c1
        L_0x0166:
            r12 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r9, r1)
            r1.append(r11)
            java.lang.String r0 = r5.getName()
            X.AnonymousClass000.A1D(r0, r8, r1)
            r12.printStackTrace()
            goto L_0x00c1
        L_0x017a:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            android.util.Log.e(r8, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r9, r1)
            r1.append(r11)
            java.lang.String r0 = r5.getName()
            X.AnonymousClass000.A1D(r0, r8, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)
            java.lang.String r0 = " must have a method "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r12, r1)
            android.util.Log.e(r8, r0)
            goto L_0x00c1
        L_0x019f:
            r6.setLayoutParams(r10)
            X.0MI r1 = r7.A04
            int r0 = r1.A02
            if (r0 != 0) goto L_0x01ad
            int r0 = r1.A03
            r6.setVisibility(r0)
        L_0x01ad:
            float r0 = r1.A00
            r6.setAlpha(r0)
            X.0TO r3 = r7.A05
            float r0 = r3.A01
            r6.setRotation(r0)
            float r0 = r3.A02
            r6.setRotationX(r0)
            float r0 = r3.A03
            r6.setRotationY(r0)
            float r0 = r3.A04
            r6.setScaleX(r0)
            float r0 = r3.A05
            r6.setScaleY(r0)
            float r1 = r3.A06
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x01d8
            r6.setPivotX(r1)
        L_0x01d8:
            float r1 = r3.A07
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x01e3
            r6.setPivotY(r1)
        L_0x01e3:
            float r0 = r3.A08
            r6.setTranslationX(r0)
            float r0 = r3.A09
            r6.setTranslationY(r0)
            float r0 = r3.A0A
            r6.setTranslationZ(r0)
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x020f
            float r0 = r3.A00
            r6.setElevation(r0)
            goto L_0x020f
        L_0x01fc:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "WARNING NO CONSTRAINTS for view "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r9)
            android.util.Log.v(r7, r0)
            goto L_0x020f
        L_0x020a:
            java.lang.String r0 = "UNKNOWN"
        L_0x020c:
            X.AnonymousClass000.A1F(r0, r7, r3)
        L_0x020f:
            int r4 = r4 + 1
            goto L_0x0016
        L_0x0213:
            java.lang.String r0 = "All children of ConstraintLayout must have ids to use ConstraintSet"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x021a:
            java.util.Iterator r9 = r17.iterator()
        L_0x021e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0296
            java.lang.Object r7 = r9.next()
            java.lang.Number r7 = (java.lang.Number) r7
            java.lang.Object r6 = r2.get(r7)
            X.0Oe r6 = (X.C04430Oe) r6
            X.0TP r8 = r6.A02
            int r0 = r8.A0b
            if (r0 == r5) goto L_0x0273
            if (r0 != r3) goto L_0x0273
            android.content.Context r0 = r20.getContext()
            androidx.constraintlayout.widget.Barrier r4 = new androidx.constraintlayout.widget.Barrier
            r4.<init>(r0)
            int r0 = r7.intValue()
            r4.setId(r0)
            int[] r0 = r8.A0z
            if (r0 != 0) goto L_0x0256
            java.lang.String r0 = r8.A0t
            if (r0 == 0) goto L_0x0259
            int[] r0 = A03(r4, r0)
            r8.A0z = r0
        L_0x0256:
            r4.setReferencedIds(r0)
        L_0x0259:
            int r0 = r8.A0Y
            r4.A00 = r0
            int r0 = r8.A0Z
            r4.setMargin(r0)
            r0 = -2
            X.02c r1 = new X.02c
            r1.<init>((int) r0, (int) r0)
            r4.A02()
            r6.A00(r1)
            r0 = r20
            r0.addView(r4, r1)
        L_0x0273:
            boolean r0 = r8.A0y
            if (r0 == 0) goto L_0x021e
            android.content.Context r0 = r20.getContext()
            androidx.constraintlayout.widget.Guideline r4 = new androidx.constraintlayout.widget.Guideline
            r4.<init>(r0)
            int r0 = r7.intValue()
            r4.setId(r0)
            r0 = -2
            X.02c r1 = new X.02c
            r1.<init>((int) r0, (int) r0)
            r6.A00(r1)
            r0 = r20
            r0.addView(r4, r1)
            goto L_0x021e
        L_0x0296:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XZ.A0A(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    public void A0B(ConstraintLayout constraintLayout) {
        C05450Tj r15;
        ConstraintLayout constraintLayout2 = constraintLayout;
        int childCount = constraintLayout2.getChildCount();
        HashMap hashMap = this.A00;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout2.getChildAt(i);
            C001702c r9 = (C001702c) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new C04430Oe());
                }
                C04430Oe r8 = (C04430Oe) hashMap.get(Integer.valueOf(id));
                HashMap hashMap2 = this.A01;
                HashMap A0t = AnonymousClass001.A0t();
                Class<?> cls = childAt.getClass();
                Iterator it = hashMap2.keySet().iterator();
                while (it.hasNext()) {
                    String A0m = AnonymousClass001.A0m(it);
                    C05450Tj r1 = (C05450Tj) hashMap2.get(A0m);
                    try {
                        if (A0m.equals("BackgroundColor")) {
                            r15 = new C05450Tj(r1, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                        } else {
                            r15 = new C05450Tj(r1, AnonymousClass000.A0K(cls, childAt, AnonymousClass000.A0V("getMap", A0m, AnonymousClass001.A0o())));
                        }
                        A0t.put(A0m, r15);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
                r8.A01 = A0t;
                r8.A00 = id;
                AnonymousClass0TP r12 = r8.A02;
                r12.A0W = r9.A0T;
                r12.A0X = r9.A0U;
                r12.A0f = r9.A0k;
                r12.A0g = r9.A0l;
                r12.A0m = r9.A0p;
                r12.A0l = r9.A0o;
                r12.A0B = r9.A0C;
                r12.A0A = r9.A0B;
                r12.A08 = r9.A0A;
                r12.A0i = r9.A0m;
                r12.A0j = r9.A0n;
                r12.A0I = r9.A0J;
                r12.A0H = r9.A0I;
                r12.A03 = r9.A02;
                r12.A05 = r9.A08;
                r12.A0r = r9.A0t;
                r12.A0C = r9.A0D;
                r12.A0D = r9.A0E;
                r12.A00 = r9.A00;
                r12.A0E = r9.A0G;
                r12.A0F = r9.A0H;
                r12.A0d = r9.A0b;
                r12.A01 = r9.A01;
                r12.A0P = r9.A0Q;
                r12.A0Q = r9.A0R;
                r12.A0c = r9.width;
                r12.A0a = r9.height;
                r12.A0V = r9.leftMargin;
                r12.A0e = r9.rightMargin;
                r12.A0k = r9.topMargin;
                r12.A09 = r9.bottomMargin;
                r12.A06 = r9.A09;
                r12.A04 = r9.A03;
                r12.A0n = r9.A0q;
                r12.A0U = r9.A0S;
                r12.A0v = r9.A0v;
                r12.A0u = r9.A0u;
                r12.A0o = r9.A0W;
                r12.A0R = r9.A0V;
                r12.A0p = r9.A0Y;
                r12.A0S = r9.A0X;
                r12.A0q = r9.A0a;
                r12.A0T = r9.A0Z;
                r12.A07 = r9.A05;
                r12.A02 = r9.A04;
                r12.A0s = r9.A0s;
                r12.A0O = r9.A0P;
                r12.A0J = r9.A0K;
                r12.A0L = r9.A0M;
                r12.A0M = r9.A0N;
                r12.A0N = r9.A0O;
                r12.A0K = r9.A0L;
                r12.A0G = r9.getMarginEnd();
                r12.A0h = r9.getMarginStart();
                AnonymousClass0MI r13 = r8.A04;
                r13.A03 = childAt.getVisibility();
                r13.A00 = childAt.getAlpha();
                AnonymousClass0TO r92 = r8.A05;
                r92.A01 = childAt.getRotation();
                r92.A02 = childAt.getRotationX();
                r92.A03 = childAt.getRotationY();
                r92.A04 = childAt.getScaleX();
                r92.A05 = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                    r92.A06 = pivotX;
                    r92.A07 = pivotY;
                }
                r92.A08 = childAt.getTranslationX();
                r92.A09 = childAt.getTranslationY();
                r92.A0A = childAt.getTranslationZ();
                if (r92.A0B) {
                    r92.A00 = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    AnonymousClass0TP r14 = r8.A02;
                    r14.A0x = barrier.A01.A02;
                    r14.A0z = barrier.getReferencedIds();
                    r14.A0Y = barrier.A00;
                    r14.A0Z = barrier.A01.A01;
                }
                i++;
            } else {
                throw AnonymousClass002.A0E("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public static int A00(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    public static SparseIntArray A01(SparseIntArray sparseIntArray, int i, int i2) {
        sparseIntArray.append(i, i2);
        return A02;
    }

    public static final String A02(int i) {
        switch (i) {
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            default:
                return "end";
        }
    }

    public void A06(int i) {
        HashMap hashMap = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(valueOf, new C04430Oe());
        }
        AnonymousClass0TP r0 = ((C04430Oe) hashMap.get(valueOf)).A02;
        r0.A0W = R.id.parent;
        r0.A0X = -1;
        r0.A0V = 0;
    }

    public void A09(ConstraintLayout constraintLayout) {
        A0A(constraintLayout);
        constraintLayout.A0B = null;
        constraintLayout.requestLayout();
    }
}
