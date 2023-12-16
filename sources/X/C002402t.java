package X;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.02t  reason: invalid class name and case insensitive filesystem */
public class C002402t extends WindowInsetsAnimation.Callback {
    public ArrayList A00;
    public List A01;
    public final AnonymousClass0QA A02;
    public final HashMap A03 = AnonymousClass001.A0t();

    public C002402t(AnonymousClass0QA r2) {
        super(r2.A01);
        this.A02 = r2;
    }

    public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        AnonymousClass0QA r2 = this.A02;
        HashMap hashMap = this.A03;
        C05820Vc r0 = (C05820Vc) hashMap.get(windowInsetsAnimation);
        if (r0 == null) {
            r0 = C05820Vc.A00(windowInsetsAnimation);
            hashMap.put(windowInsetsAnimation, r0);
        }
        r2.A03(r0);
        hashMap.remove(windowInsetsAnimation);
    }

    public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        AnonymousClass0QA r2 = this.A02;
        HashMap hashMap = this.A03;
        C05820Vc r0 = (C05820Vc) hashMap.get(windowInsetsAnimation);
        if (r0 == null) {
            r0 = C05820Vc.A00(windowInsetsAnimation);
            hashMap.put(windowInsetsAnimation, r0);
        }
        r2.A02(r0);
    }

    public WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.A00;
        if (arrayList == null) {
            ArrayList A0p = AnonymousClass000.A0p(list);
            this.A00 = A0p;
            this.A01 = Collections.unmodifiableList(A0p);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
                HashMap hashMap = this.A03;
                C05820Vc r2 = (C05820Vc) hashMap.get(windowInsetsAnimation);
                if (r2 == null) {
                    r2 = C05820Vc.A00(windowInsetsAnimation);
                    hashMap.put(windowInsetsAnimation, r2);
                }
                r2.A00.A08(windowInsetsAnimation.getFraction());
                this.A00.add(r2);
            } else {
                AnonymousClass0QA r22 = this.A02;
                AnonymousClass0XY A0X = AnonymousClass001.A0X(windowInsets);
                r22.A01(A0X, this.A01);
                return A0X.A06();
            }
        }
    }

    public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        AnonymousClass0QA r2 = this.A02;
        HashMap hashMap = this.A03;
        C05820Vc r1 = (C05820Vc) hashMap.get(windowInsetsAnimation);
        if (r1 == null) {
            r1 = C05820Vc.A00(windowInsetsAnimation);
            hashMap.put(windowInsetsAnimation, r1);
        }
        C06020Vx A002 = C06020Vx.A00(bounds);
        r2.A00(A002, r1);
        return A002.A01();
    }
}
