package X;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES10;
import android.opengl.GLES20;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6jO  reason: invalid class name and case insensitive filesystem */
public final class C134646jO extends C67303Ot {
    public final AnonymousClass5HN A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C134646jO(X.C56492s4 r13, X.AnonymousClass5HN r14, X.AnonymousClass33p r15, X.AnonymousClass1VX r16, X.C183538qC r17, java.lang.String r18, X.AnonymousClass4C1 r19, X.AnonymousClass4C1 r20) {
        /*
            r12 = this;
            r1 = r13
            r2 = r15
            r3 = r16
            r5 = r17
            r9 = r19
            X.C18260x0.A0f(r3, r13, r15, r5, r9)
            r0 = 6
            r8 = r20
            X.C162457s7.A0J(r8, r0)
            r10 = 5799866010102237(0x149af28946e9dd, double:2.8655145460738555E-308)
            r4 = 0
            r0 = r12
            r6 = r18
            r7 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.A00 = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134646jO.<init>(X.2s4, X.5HN, X.33p, X.1VX, X.8qC, java.lang.String, X.4C1, X.4C1):void");
    }

    public void A07(JSONObject jSONObject) {
        Map map;
        RuntimeException runtimeException;
        String str;
        C162457s7.A0J(jSONObject, 0);
        JSONObject A1G = AnonymousClass0x9.A1G();
        AnonymousClass5HN r5 = this.A00;
        JSONObject A1G2 = AnonymousClass0x9.A1G();
        if (r5.A00 == null) {
            throw C18270x1.A0S("capabilityGetter");
        } else if (r5.A01 != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            A0s.add("faceTracker");
            A0s.add("worldTracker");
            A0s.add("halfFloatRenderPass");
            A0s.add("depthShaderRead");
            A0s.add("multipleRenderTargets");
            A0s.add("vertexTextureFetch");
            A1G2.put("manifest_capabilities", new JSONArray(A0s));
            if (C155487ez.A02.contains(Build.MODEL)) {
                map = AnonymousClass001.A0t();
            } else {
                if (C155487ez.A01 == null) {
                    C155487ez.A01 = AnonymousClass001.A0t();
                    try {
                        C148387Ie r8 = null;
                        if (((EGL10) EGLContext.getEGL()).eglGetCurrentContext().equals(EGL10.EGL_NO_CONTEXT)) {
                            C158087jP r7 = new C158087jP();
                            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(r7.A02, r7.A00, new int[]{12375, 1, 12374, 1, 12344}, 0);
                            int eglGetError = EGL14.eglGetError();
                            if (eglGetError != 12288) {
                                StringBuilder A0l = AnonymousClass000.A0l("eglCreatePbufferSurface");
                                AnonymousClass000.A1G(": EGL error: 0x", A0l, eglGetError);
                                runtimeException = AnonymousClass6C7.A0e(A0l);
                            } else if (eglCreatePbufferSurface != null) {
                                if (r7.A02 == EGL14.EGL_NO_DISPLAY) {
                                    Log.i("MsqrdEglCore", "NOTE: makeCurrent w/o display");
                                }
                                if (EGL14.eglMakeCurrent(r7.A02, eglCreatePbufferSurface, eglCreatePbufferSurface, r7.A01)) {
                                    r8 = new C148387Ie(eglCreatePbufferSurface, r7);
                                } else {
                                    runtimeException = AnonymousClass002.A0E("eglMakeCurrent failed");
                                }
                            } else {
                                runtimeException = AnonymousClass002.A0E("surface was null");
                            }
                            throw runtimeException;
                        }
                        int[] A0E = C18330xA.A0E();
                        GLES20.glGetIntegerv(34466, A0E, 0);
                        int i = A0E[0];
                        int[] iArr = new int[i];
                        GLES20.glGetIntegerv(34467, iArr, 0);
                        int i2 = 0;
                        while (true) {
                            if (i2 >= i) {
                                break;
                            } else if (iArr[i2] == 37496) {
                                C155487ez.A01.put("etc2_compression", Boolean.TRUE);
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (GLES10.glGetString(7939).contains("GL_IMG_texture_compression_pvrtc")) {
                            C155487ez.A01.put("pvr_compression", Boolean.TRUE);
                        }
                        if (r8 != null) {
                            C158087jP r72 = r8.A01;
                            EGLDisplay eGLDisplay = r72.A02;
                            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                            if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                                EGL14.eglDestroySurface(r72.A02, r8.A00);
                                r72.A00();
                            } else {
                                runtimeException = AnonymousClass002.A0E("eglMakeCurrent failed");
                                throw runtimeException;
                            }
                        }
                    } catch (Throwable th) {
                        Log.e(C155487ez.class.getSimpleName(), "Error while checking for capabilities", th);
                    }
                }
                map = C155487ez.A01;
            }
            C162457s7.A0D(map);
            Iterator A0i = C18280x3.A0i(map);
            while (true) {
                if (!A0i.hasNext()) {
                    str = "UNCOMPRESSED";
                    break;
                }
                String A0m = AnonymousClass001.A0m(A0i);
                if (C175738Zn.A0Y(A0m, "etc", false)) {
                    str = "ETC";
                } else if (C175738Zn.A0Y(A0m, "pvr", false)) {
                    str = "PVR";
                } else if (C175738Zn.A0Y(A0m, "astc", false)) {
                    str = "ASTC";
                } else {
                    str = "";
                }
                if (str.length() > 0) {
                    break;
                }
            }
            A1G2.put("texture_compression", str);
            if (r5.A00 != null) {
                String[] strArr = AnonymousClass76U.A00;
                Pair A0C = AnonymousClass0x9.A0C(Double.valueOf(Double.parseDouble(strArr[0])), Double.valueOf(Double.parseDouble(strArr[strArr.length - 1])));
                JSONObject A1G3 = AnonymousClass0x9.A1G();
                Object obj = A0C.first;
                C162457s7.A0C(obj);
                A1G3.put("min_version", AnonymousClass6C9.A02(obj));
                Object obj2 = A0C.second;
                C162457s7.A0C(obj2);
                A1G3.put("max_version", AnonymousClass6C9.A02(obj2));
                A1G2.put("supported_sdk_versions", A1G3);
                A1G.put("device_capabilities", A1G2);
                A1G.put("product_surface", "VIDEO_CALLING");
                A1G.put("effect_categories", new JSONArray(C18290x4.A12("PERSONALIZED_AVATAR")));
                A1G.put("delivery_tier", this.A04.A0Q(3076));
                A1G.put("page_size", 1);
                A1G.put("supported_compression_types", new JSONArray(AnonymousClass8UF.A0o("NONE", "ZIP")));
                jSONObject.put("variables", A1G);
                return;
            }
            throw C18270x1.A0S("capabilityGetter");
        } else {
            throw C18270x1.A0S("waContext");
        }
    }
}
