package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass0XH;
import X.AnonymousClass0x7;
import X.AnonymousClass4L0;
import X.AnonymousClass5Yj;
import X.AnonymousClass69K;
import X.C107575bX;
import X.C116975rB;
import X.C1235268t;
import X.C162457s7;
import X.C175728Zm;
import X.C18270x1;
import X.C18300x5;
import X.C18330xA;
import X.C19340zH;
import X.C620633i;
import X.C66433Lk;
import X.C69263Wi;
import X.C72023d3;
import X.C73723fy;
import X.C85244Fm;
import X.C86624Kv;
import X.C86634Kw;
import X.C88944b3;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.widget.TextView;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

public final class SuspiciousLinkWarningDialogFragment extends Hilt_SuspiciousLinkWarningDialogFragment {
    public Dialog A1J(Bundle bundle) {
        AbstractCollection abstractCollection;
        int length;
        String host;
        Collection collection;
        int length2;
        String string = A0H().getString("url");
        Serializable serializable = A0H().getSerializable("phishingChars");
        if (serializable instanceof HashSet) {
            abstractCollection = (AbstractCollection) serializable;
        } else {
            abstractCollection = null;
        }
        C66433Lk r1 = this.A05;
        if (r1 != null) {
            String obj = C66433Lk.A00(r1, "26000162").toString();
            C162457s7.A0D(obj);
            SpannableStringBuilder A00 = C18330xA.A00(C107575bX.A00(A0G(), new Object[]{obj}, R.string.f11nameremoved));
            URLSpan[] uRLSpanArr = (URLSpan[]) A00.getSpans(0, A00.length(), URLSpan.class);
            if (uRLSpanArr != null) {
                int i = 0;
                while (i < r7) {
                    URLSpan uRLSpan = uRLSpanArr[i];
                    Context A0G = A0G();
                    C69263Wi r15 = this.A00;
                    if (r15 != null) {
                        C620633i r12 = this.A02;
                        if (r12 != null) {
                            C85244Fm r14 = this.A01;
                            if (r14 != null) {
                                A00.setSpan(new C88944b3(A0G, r14, r15, r12, uRLSpan.getURL()), A00.getSpanStart(uRLSpan), A00.getSpanEnd(uRLSpan), A00.getSpanFlags(uRLSpan));
                                i++;
                            } else {
                                throw C18270x1.A0S("linkLauncher");
                            }
                        } else {
                            throw C18270x1.A0S("systemServices");
                        }
                    } else {
                        throw C18270x1.A0S("globalUI");
                    }
                }
                for (URLSpan removeSpan : uRLSpanArr) {
                    A00.removeSpan(removeSpan);
                }
            }
            A00.append("\n\n");
            if (!(string == null || (length = string.length()) == 0 || abstractCollection == null)) {
                ForegroundColorSpan A0I = C86634Kw.A0I(A0G(), R.color.f5nameremoved);
                String str = string;
                if (string.codePointCount(0, length) > 96) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append(C107575bX.A0C(string, 96));
                    str = AnonymousClass001.A0j(A0o, 8230);
                }
                SpannableString A0A = AnonymousClass4L0.A0A(str);
                Uri parse = Uri.parse(string);
                if (!(parse == null || (host = parse.getHost()) == null)) {
                    List A01 = new C116975rB("\\.").A01(host, 0);
                    if (!A01.isEmpty()) {
                        ListIterator listIterator = A01.listIterator(A01.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                if (((String) listIterator.previous()).length() != 0) {
                                    collection = C73723fy.A0J(A01, listIterator.nextIndex() + 1);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    collection = C72023d3.A00;
                    String[] A1b = AnonymousClass0x7.A1b(collection);
                    if (A1b != null) {
                        int i2 = -1;
                        for (String str2 : A1b) {
                            boolean z = false;
                            int i3 = -1;
                            int i4 = 0;
                            while (true) {
                                length2 = str2.length();
                                if (i4 >= length2) {
                                    break;
                                }
                                int codePointAt = str2.codePointAt(i4);
                                int charCount = Character.charCount(codePointAt);
                                if (C86624Kv.A1a(abstractCollection, codePointAt)) {
                                    i3 = C175728Zm.A0C(string, (char) codePointAt, i3 + 1);
                                    A0A.setSpan(new StyleSpan(1), i3, i3 + charCount, 33);
                                    z = true;
                                }
                                i4 += charCount;
                            }
                            if (z) {
                                i2 = C175728Zm.A0G(string, str2, i2 + 1, false);
                                A0A.setSpan(A0I, i2, length2 + i2, 33);
                            }
                        }
                    }
                }
                AnonymousClass0XH r13 = this.A01.A05().A01;
                A00.append(r13.A03(r13.A00, A0A));
            }
            C19340zH A0M = C18300x5.A0M(this);
            A0M.A0U(R.string.f11nameremoved);
            A0M.A0g(A00);
            A0M.A0i(true);
            A0M.A0W(new AnonymousClass69K(0, string, this), R.string.f11nameremoved);
            C1235268t.A03(A0M, this, 3, R.string.f11nameremoved);
            return C18300x5.A0H(A0M);
        }
        throw C18270x1.A0S("faqLinkFactory");
    }

    public void A0g() {
        super.A0g();
        TextView textView = (TextView) A1I().findViewById(16908299);
        if (textView != null) {
            C18270x1.A0q(textView, this.A02);
            AnonymousClass5Yj.A08(A0Q(), A0R(), textView, R.attr.f3nameremoved, R.color.f5nameremoved);
        }
    }
}
