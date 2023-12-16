package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;

/* renamed from: X.0Hs  reason: invalid class name and case insensitive filesystem */
public final class C02820Hs {
    public static final Bundle A00(AnonymousClass3Z6... r9) {
        Bundle bundle = new Bundle(r7);
        for (AnonymousClass3Z6 r0 : r9) {
            String str = (String) r0.A0B();
            Object A0C = r0.A0C();
            if (A0C == null) {
                bundle.putString(str, (String) null);
            } else if (A0C instanceof Boolean) {
                bundle.putBoolean(str, AnonymousClass001.A1Z(A0C));
            } else if (A0C instanceof Byte) {
                bundle.putByte(str, ((Number) A0C).byteValue());
            } else if (A0C instanceof Character) {
                bundle.putChar(str, ((Character) A0C).charValue());
            } else if (A0C instanceof Double) {
                bundle.putDouble(str, ((Number) A0C).doubleValue());
            } else if (A0C instanceof Float) {
                bundle.putFloat(str, AnonymousClass001.A05(A0C));
            } else if (A0C instanceof Integer) {
                bundle.putInt(str, AnonymousClass001.A0K(A0C));
            } else if (A0C instanceof Long) {
                bundle.putLong(str, ((Number) A0C).longValue());
            } else if (A0C instanceof Short) {
                bundle.putShort(str, ((Number) A0C).shortValue());
            } else if (A0C instanceof Bundle) {
                bundle.putBundle(str, (Bundle) A0C);
            } else if (A0C instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) A0C);
            } else if (A0C instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) A0C);
            } else if (A0C instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) A0C);
            } else if (A0C instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) A0C);
            } else if (A0C instanceof char[]) {
                bundle.putCharArray(str, (char[]) A0C);
            } else if (A0C instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) A0C);
            } else if (A0C instanceof float[]) {
                bundle.putFloatArray(str, (float[]) A0C);
            } else if (A0C instanceof int[]) {
                bundle.putIntArray(str, (int[]) A0C);
            } else if (A0C instanceof long[]) {
                bundle.putLongArray(str, (long[]) A0C);
            } else if (A0C instanceof short[]) {
                bundle.putShortArray(str, (short[]) A0C);
            } else {
                if (A0C instanceof Object[]) {
                    Class<?> componentType = A0C.getClass().getComponentType();
                    C162457s7.A0H(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        C162457s7.A0K(A0C, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                        bundle.putParcelableArray(str, (Parcelable[]) A0C);
                    } else if (String.class.isAssignableFrom(componentType)) {
                        C162457s7.A0K(A0C, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                        bundle.putStringArray(str, (String[]) A0C);
                    } else if (CharSequence.class.isAssignableFrom(componentType)) {
                        C162457s7.A0K(A0C, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                        bundle.putCharSequenceArray(str, (CharSequence[]) A0C);
                    } else if (!Serializable.class.isAssignableFrom(componentType)) {
                        String canonicalName = componentType.getCanonicalName();
                        StringBuilder A0o = AnonymousClass001.A0o();
                        AnonymousClass001.A1K("Illegal value array type ", canonicalName, " for key \"", A0o);
                        A0o.append(str);
                        throw AnonymousClass001.A0c(AnonymousClass001.A0j(A0o, '\"'));
                    }
                } else if (!(A0C instanceof Serializable)) {
                    if (A0C instanceof IBinder) {
                        C02790Hp.A00(bundle, (IBinder) A0C, str);
                    } else if (A0C instanceof Size) {
                        AnonymousClass0RX.A00(bundle, (Size) A0C, str);
                    } else if (A0C instanceof SizeF) {
                        AnonymousClass0RX.A01(bundle, (SizeF) A0C, str);
                    } else {
                        String canonicalName2 = A0C.getClass().getCanonicalName();
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        AnonymousClass001.A1K("Illegal value type ", canonicalName2, " for key \"", A0o2);
                        A0o2.append(str);
                        throw AnonymousClass001.A0c(AnonymousClass001.A0j(A0o2, '\"'));
                    }
                }
                bundle.putSerializable(str, (Serializable) A0C);
            }
        }
        return bundle;
    }
}
