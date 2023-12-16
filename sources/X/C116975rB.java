package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.5rB  reason: invalid class name and case insensitive filesystem */
public final class C116975rB implements Serializable {
    public Set _options;
    public final Pattern nativePattern;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C116975rB(java.lang.String r2) {
        /*
            r1 = this;
            r0 = 1
            X.C162457s7.A0J(r2, r0)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r2)
            X.C162457s7.A0D(r0)
            r1.<init>((java.util.regex.Pattern) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116975rB.<init>(java.lang.String):void");
    }

    public final String A00(CharSequence charSequence, String str) {
        C162457s7.A0J(charSequence, 0);
        String replaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        C162457s7.A0D(replaceAll);
        return replaceAll;
    }

    public final List A01(CharSequence charSequence, int i) {
        C162457s7.A0J(charSequence, 0);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return C18290x4.A12(charSequence.toString());
        }
        int i2 = 10;
        if (i > 0) {
            i2 = i;
        }
        ArrayList A0I = AnonymousClass002.A0I(i2);
        int i3 = i - 1;
        int i4 = 0;
        do {
            AnonymousClass0x7.A1D(charSequence.subSequence(i4, matcher.start()), A0I);
            i4 = matcher.end();
            if ((i3 >= 0 && A0I.size() == i3) || !matcher.find()) {
                AnonymousClass0x7.A1D(charSequence.subSequence(i4, charSequence.length()), A0I);
            }
            AnonymousClass0x7.A1D(charSequence.subSequence(i4, matcher.start()), A0I);
            i4 = matcher.end();
            break;
        } while (!matcher.find());
        AnonymousClass0x7.A1D(charSequence.subSequence(i4, charSequence.length()), A0I);
        return A0I;
    }

    private final Object writeReplace() {
        String pattern = this.nativePattern.pattern();
        C162457s7.A0D(pattern);
        return new AnonymousClass8LD(pattern, this.nativePattern.flags());
    }

    public String toString() {
        return C18290x4.A0o(this.nativePattern);
    }

    public C116975rB(Pattern pattern) {
        this.nativePattern = pattern;
    }
}
