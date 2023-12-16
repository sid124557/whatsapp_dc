package X;

import android.util.Base64;
import com.facebook.minscript.compiler.MinsCompilerImpl$Helper;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.7ci  reason: invalid class name and case insensitive filesystem */
public class C154167ci {
    public static Object A00(C157967jD r14, C835248t r15, C151147Tp r16) {
        C160437nd r0;
        String message;
        boolean z;
        C162427s4 r7;
        String str;
        C160437nd r02;
        if (r15 instanceof AnonymousClass8DF) {
            AnonymousClass8DF r9 = (AnonymousClass8DF) r15;
            C151147Tp r1 = r16;
            AnonymousClass8DE r2 = r1.A03;
            A01(r9);
            AnonymousClass7KA r3 = r9.A00;
            if (r3 != null) {
                C156077fz r8 = r9.A01;
                if (r8 != null) {
                    r0 = r8.A00;
                    if (r0 == null) {
                        throw AnonymousClass001.A0e("getBytecodeFile() was called while bytecodeFile is null. This normally happens when getBytecodeFile() is called before calling \"ensurePrepared()\" method");
                    }
                } else {
                    r0 = r3.A00.A03;
                }
                r2.BNc(r14, r15, r0.A00);
                try {
                    List<Object> unmodifiableList = Collections.unmodifiableList(r14.A00);
                    ThreadLocal threadLocal = AnonymousClass77N.A00;
                    if (threadLocal.get() == null) {
                        r7 = new C162427s4();
                        threadLocal.set(r7);
                        z = true;
                    } else {
                        r7 = (C162427s4) threadLocal.get();
                        z = false;
                    }
                    try {
                        C146797Bq r10 = new C146797Bq(r1);
                        int i = r7.A01;
                        r7.A0Q(unmodifiableList.size() + 1 + 5);
                        r7.A0V((Object) null);
                        for (Object A0V : unmodifiableList) {
                            r7.A0V(A0V);
                        }
                        r7.A0W(new C155787fV(new AnonymousClass8DF((C156077fz) null, r3, r3.A01)), (Object) null, unmodifiableList.size(), r7.A02);
                        C146797Bq r12 = r7.A03;
                        r7.A03 = r10;
                        try {
                            r7.A0N();
                            r7.A03 = r12;
                            Object A08 = C162427s4.A08(r7);
                            r7.A0O();
                            int i2 = r7.A01;
                            if (i2 != i) {
                                Object[] A0M = AnonymousClass002.A0M();
                                C86604Kt.A1X(A0M, i2, 0, i, 1);
                                C162427s4.A0F(String.format("Execution ended prematurely: stack size = %d, initial stack size = %d", A0M));
                                th = AnonymousClass000.A0L();
                                throw th;
                            }
                            if (z) {
                                threadLocal.remove();
                            }
                            if (r8 != null) {
                                r02 = r8.A00;
                                if (r02 == null) {
                                    throw AnonymousClass001.A0e("getBytecodeFile() was called while bytecodeFile is null. This normally happens when getBytecodeFile() is called before calling \"ensurePrepared()\" method");
                                }
                            } else {
                                AnonymousClass7KA r03 = r9.A00;
                                if (r03 != null) {
                                    r02 = r03.A00.A03;
                                } else {
                                    str = null;
                                    r2.BMI(r14, r15, A08, str);
                                    return A08;
                                }
                            }
                            str = r02.A00;
                            r2.BMI(r14, r15, A08, str);
                            return A08;
                        } catch (Throwable th) {
                            th = th;
                            r7.A03 = r12;
                        }
                    } catch (C173668Rc e) {
                        throw e;
                    } catch (RuntimeException e2) {
                        throw new C173668Rc((Throwable) e2);
                    } catch (C173668Rc e3) {
                        if (z) {
                            try {
                                throw new C143296ye(e3);
                            } catch (Throwable th2) {
                                if (z) {
                                    threadLocal.remove();
                                }
                                throw th2;
                            }
                        } else {
                            throw e3;
                        }
                    }
                } catch (C143296ye e4) {
                    if (e4.getMessage() == null) {
                        message = "";
                    } else {
                        message = e4.getMessage();
                    }
                    r2.Bar(r15, message);
                    throw e4;
                }
            } else {
                throw AnonymousClass001.A0e("The Lispy expression has not been parsed");
            }
        } else {
            throw AnonymousClass002.A0E("Interpreter.evaluate expects OpaqueExpression");
        }
    }

    public static void A01(C835248t r15) {
        ByteBuffer doCompile;
        if (r15 instanceof AnonymousClass8DF) {
            AnonymousClass8DF r152 = (AnonymousClass8DF) r15;
            if (r152.A00 == null) {
                C156077fz r4 = r152.A01;
                if (r4 != null) {
                    C160437nd r9 = r4.A00;
                    if (r9 == null) {
                        String str = r4.A01;
                        if (str.startsWith("sraxr")) {
                            doCompile = ByteBuffer.wrap(Base64.decode(str, 0));
                        } else {
                            if (str.startsWith("lispx")) {
                                str = str.substring(15);
                            }
                            try {
                                doCompile = MinsCompilerImpl$Helper.doCompile(str.getBytes(DefaultCrypto.UTF_8));
                            } catch (UnsupportedEncodingException e) {
                                throw C18330xA.A09(e);
                            }
                        }
                        doCompile.order(ByteOrder.nativeOrder());
                        ByteBuffer slice = doCompile.slice();
                        slice.order(doCompile.order());
                        int capacity = doCompile.capacity();
                        int i = slice.getInt();
                        short s = slice.getShort() & 65535;
                        short s2 = 65535 & slice.getShort();
                        if (i == -1397639502 && s == 1 && s2 == 0) {
                            int i2 = slice.getInt();
                            int i3 = slice.getInt();
                            int position = doCompile.position();
                            if (i2 > capacity) {
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("buffer is smaller than encoded size ");
                                A0o.append(i2);
                                AnonymousClass001.A1L(A0o);
                                A0o.append(capacity);
                                A0o.append(" byteBuffer.order:");
                                A0o.append(doCompile.order());
                                A0o.append(" native order:");
                                throw new C173668Rc(AnonymousClass000.A0R(ByteOrder.nativeOrder(), A0o));
                            } else if (i2 >= position) {
                                int i4 = position + (i3 * 16);
                                if (i4 <= i2) {
                                    AnonymousClass7K9[] r14 = new AnonymousClass7K9[i3];
                                    int i5 = 0;
                                    while (i5 < i3) {
                                        AnonymousClass7K9 r6 = new AnonymousClass7K9();
                                        r6.A00 = slice.getInt();
                                        r6.A02 = slice.getInt();
                                        r6.A01 = slice.getInt();
                                        slice.getInt();
                                        int i6 = r6.A02;
                                        if (i6 % 4 == 0) {
                                            int i7 = r6.A01;
                                            if (i4 > i6 || i6 + i7 > i2) {
                                                Object[] objArr = new Object[2];
                                                AnonymousClass000.A1P(objArr, i5, 0);
                                                AnonymousClass000.A1P(objArr, r6.A00, 1);
                                                throw new C173668Rc(String.format("section index %d kind %d invalid offset/size", objArr));
                                            }
                                            r14[i5] = r6;
                                            i5++;
                                        } else {
                                            Object[] objArr2 = new Object[2];
                                            AnonymousClass000.A1P(objArr2, i5, 0);
                                            AnonymousClass000.A1P(objArr2, r6.A00, 1);
                                            throw new C173668Rc(String.format("section index %d kind %d invalid alignment", objArr2));
                                        }
                                    }
                                    if (i3 >= 4) {
                                        int i8 = 0;
                                        while (r14[i8].A00 == i8) {
                                            i8++;
                                            if (i8 >= 4) {
                                                AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(r14[0].A01 / 16);
                                                AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(r14[1].A01 / 16);
                                                String str2 = "";
                                                for (int i9 = 4; i9 < i3; i9++) {
                                                    AnonymousClass7K9 r7 = r14[i9];
                                                    if (r7.A00 == 4) {
                                                        ByteBuffer duplicate = slice.duplicate();
                                                        duplicate.position(r7.A02);
                                                        duplicate.limit(r7.A02 + r7.A01);
                                                        byte[] bArr = new byte[duplicate.remaining()];
                                                        duplicate.get(bArr);
                                                        str2 = new String(bArr, C160437nd.A05);
                                                    }
                                                }
                                                r9 = new C160437nd(str2, slice, atomicReferenceArray, atomicReferenceArray2, r14);
                                                r4.A00 = r9;
                                            }
                                        }
                                        throw new C173668Rc(AnonymousClass000.A0Y("missing required section ", AnonymousClass001.A0o(), i8));
                                    }
                                    throw new C173668Rc("less than required number of sections");
                                }
                                throw new C173668Rc("encoded size not enough for section headers");
                            } else {
                                throw new C173668Rc("encoded size is too small");
                            }
                        } else {
                            throw new C173668Rc("invalid magic or version");
                        }
                    }
                    r152.A00 = new AnonymousClass7KA(r9.A00(0), r152.A02, (Object[]) null);
                    return;
                }
                throw AnonymousClass001.A0e("The Lispy expression cannot be parsed");
            }
            return;
        }
        throw AnonymousClass002.A0E("ensureParsed expects OpaqueExpression");
    }
}
