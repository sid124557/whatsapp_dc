package X;

/* renamed from: X.8Aa  reason: invalid class name and case insensitive filesystem */
public final class C169628Aa implements C186258v0 {
    public final AnonymousClass72U A00;
    public final C187818xr A01;
    public final AnonymousClass72V A02;

    public static int A00(C148847Jy r2, byte[] bArr, int i, int i2, int i3) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return C161917qp.A02(r2, bArr, i2);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return C161917qp.A01(r2, bArr, i2) + r2.A00;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = C161917qp.A01(r2, bArr, i2);
                    i6 = r2.A00;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = A00(r2, bArr, i6, i2, i3);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw new C140566tx("Failed to parse the message.");
            } else if (i4 == 5) {
                return i2 + 4;
            }
        }
        throw new C140566tx("Protocol message contained an invalid tag (zero).");
    }

    public final boolean B2c(Object obj, Object obj2) {
        return AnonymousClass6C9.A1L(((C128166Va) obj).zzjp.equals(((C128166Va) obj2).zzjp) ? 1 : 0);
    }

    public final int BFY(Object obj) {
        return ((C128166Va) obj).zzjp.hashCode();
    }

    public final Object BLT() {
        return ((AnonymousClass8AY) ((C128166Va) this.A01).A06(5)).Btk();
    }

    public final void BtQ(C148847Jy r14, Object obj, byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i;
        C160647o3 A012 = C128166Va.A01(obj);
        while (true) {
            i3 = i2;
            if (i4 >= i3) {
                break;
            }
            C148847Jy r7 = r14;
            byte[] bArr2 = bArr;
            i4 = C161917qp.A01(r14, bArr2, i4);
            int i5 = r14.A00;
            if (i5 == 11) {
                int i6 = 0;
                Object obj2 = null;
                while (i4 < i3) {
                    i4 = C161917qp.A01(r14, bArr2, i4);
                    int i7 = r14.A00;
                    int i8 = i7 >>> 3;
                    int i9 = i7 & 7;
                    if (i8 != 2) {
                        if (i8 == 3 && i9 == 2) {
                            i4 = C161917qp.A03(r14, bArr2, i4);
                            obj2 = r14.A02;
                        }
                    } else if (i9 == 0) {
                        i4 = C161917qp.A01(r14, bArr2, i4);
                        i6 = r14.A00;
                    }
                    if (i7 == 12) {
                        break;
                    }
                    i4 = A00(r14, bArr2, i7, i4, i3);
                }
                if (obj2 != null) {
                    A012.A01((i6 << 3) | 2, obj2);
                }
            } else if ((i5 & 7) == 2) {
                i4 = C161917qp.A00(r7, A012, bArr2, i5, i4, i3);
            } else {
                i4 = A00(r14, bArr2, i5, i4, i3);
            }
        }
        if (i4 != i3) {
            throw new C140566tx("Failed to parse the message.");
        }
    }

    public final void BtU(C181018m0 r2, Object obj) {
        throw AnonymousClass001.A0g("zzjv");
    }

    public final void Btp(Object obj) {
        ((C128166Va) obj).zzjp.A02 = false;
        throw AnonymousClass001.A0g("zzjv");
    }

    public final int BuG(Object obj) {
        C160647o3 r7 = ((C128166Va) obj).zzjp;
        int i = r7.A01;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < r7.A00; i2++) {
                i += 2 + 1 + AnonymousClass6C7.A00(r7.A03[i2] >>> 3) + C150347Qg.A04(((C172528Lo) r7.A04[i2]).A02(), AnonymousClass6C7.A00(24));
            }
            r7.A01 = i;
        }
        return i;
    }

    public final boolean BuI(Object obj) {
        throw AnonymousClass001.A0g("zzjv");
    }

    public C169628Aa(AnonymousClass72U r1, C187818xr r2, AnonymousClass72V r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void Btq(Object obj, Object obj2) {
        C162487sD.A0R(obj, obj2);
    }
}
