package X;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.enums.EnumEntries;

/* renamed from: X.3fr  reason: invalid class name and case insensitive filesystem */
public final class C73653fr<T extends Enum<T>> extends C73683fu<T> implements EnumEntries<T>, Serializable, C834348j {
    public final Enum[] entries;

    public static C73653fr A00(Enum[] enumArr) {
        return new C73653fr(enumArr);
    }

    private final Object writeReplace() {
        return new AnonymousClass3Z8(this.entries);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            Enum enumR = (Enum) obj;
            C162457s7.A0J(enumR, 0);
            Enum[] enumArr = this.entries;
            int ordinal = enumR.ordinal();
            C162457s7.A0J(enumArr, 0);
            if (ordinal < 0 || ordinal > enumArr.length - 1 || enumArr[ordinal] != enumR) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C73653fr(Enum[] enumArr) {
        this.entries = enumArr;
    }
}
