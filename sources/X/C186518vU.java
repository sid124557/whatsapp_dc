package X;

import android.content.Context;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.textfield.TextInputEditText;
import java.util.List;
import java.util.Locale;

/* renamed from: X.8vU  reason: invalid class name and case insensitive filesystem */
public interface C186518vU {
    void Axx(Context context, View view, C15790rw r3, C15790rw r4, C15790rw r5, Integer num, Integer num2, String str, String str2, String str3, int i, boolean z);

    void Axz(Context context, View view, C150957Sw r3, String str, String str2, String str3, String str4, String str5, int i, long j, boolean z, boolean z2);

    void Ay0(ImageView imageView, C15810ry r2, C15810ry r3, Object obj, String str, String str2, String str3, String str4);

    void Ay1(Context context, View view, C15790rw r3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z, boolean z2);

    void Ay2(View view, AnonymousClass7KP r2, float f, int i, int i2, int i3, int i4);

    void Ay3(View view, String str, boolean z);

    void B1z(ImageView imageView, C58572vT r2, String str, String str2);

    void B20(ImageView imageView, byte[] bArr);

    Spannable B7q(Context context, Context context2, C15790rw r3, String str, List list, List list2, List list3, List list4);

    TextWatcher B9L(TextInputEditText textInputEditText, Integer num, String str, String str2);

    InputFilter BA1();

    CharacterStyle BER(Runnable runnable, int i, int i2, int i3);

    Locale BEW();

    void BmV(AnonymousClass03n r1);

    void Bnp(View view, long j);

    void BqH();

    void BrG(View view);

    void BrI(View view);

    void BrJ(View view);
}
