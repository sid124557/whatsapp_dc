package com.facebook.rendercore;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x7;
import X.C151847Wn;
import X.C161797qU;
import X.C162457s7;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import android.graphics.Rect;
import java.util.List;
import java.util.Locale;

public class RenderTreeNode {
    public List A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Rect A04;
    public final Rect A05;
    public final RenderTreeNode A06;
    public final C161797qU A07;
    public final Object A08;

    public String A00(C151847Wn r12) {
        int i;
        int i2;
        long j;
        C161797qU r0 = this.A07;
        long A0B = r0.A0B();
        String A0E = r0.A0E();
        if (r12 != null) {
            Object obj = r12.A01.get(A0B, AnonymousClass0x7.A0f());
            C162457s7.A0D(obj);
            i = AnonymousClass001.A0K(obj);
        } else {
            i = -1;
        }
        String shortString = this.A04.toShortString();
        List list = this.A00;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        RenderTreeNode renderTreeNode = this.A06;
        if (renderTreeNode != null) {
            j = renderTreeNode.A07.A0B();
        } else {
            j = -1;
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        C18280x3.A19(Long.valueOf(A0B), A0E, objArr);
        AnonymousClass000.A1P(objArr, i, 2);
        AnonymousClass000.A1O(objArr, this.A03);
        objArr[4] = shortString;
        C18310x6.A1U(objArr, this.A01);
        C18290x4.A1U(objArr, this.A02);
        AnonymousClass000.A1P(objArr, i2, 7);
        AnonymousClass000.A1Q(objArr, 8, j);
        return String.format(locale, "Id=%d; renderUnit='%s'; indexInTree=%d; posInParent=%d; bounds=%s; absPosition=[%d, %d]; childCount=%d; parentId=%d;", objArr);
    }

    public RenderTreeNode(Rect rect, Rect rect2, RenderTreeNode renderTreeNode, C161797qU r6, Object obj, int i) {
        int i2;
        int i3;
        this.A06 = renderTreeNode;
        this.A07 = r6;
        this.A08 = obj;
        this.A04 = rect;
        if (renderTreeNode != null) {
            i2 = renderTreeNode.A01 + rect.left;
        } else {
            i2 = rect.left;
        }
        this.A01 = i2;
        if (renderTreeNode != null) {
            i3 = renderTreeNode.A02 + rect.top;
        } else {
            i3 = rect.top;
        }
        this.A02 = i3;
        this.A05 = rect2;
        this.A03 = i;
    }
}
