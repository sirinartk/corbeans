/*
 *     Corbeans: Corda integration for Spring Boot
 *     Copyright (C) 2018 Manos Batsis
 *
 *     This library is free software; you can redistribute it and/or
 *     modify it under the terms of the GNU Lesser General Public
 *     License as published by the Free Software Foundation; either
 *     version 3 of the License, or (at your option) any later version.
 *
 *     This library is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *     Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public
 *     License along with this library; if not, write to the Free Software
 *     Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301
 *     USA
 */
package com.github.manosbatsis.corbeans.spring.boot.corda.bnms.web.support

import com.github.manosbatsis.corbeans.spring.boot.corda.bnms.message.MembershipPartiesMessage
import com.r3.businessnetworks.membership.states.MembershipState
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import java.util.Optional

@Tag(name = "BNMS BNO", description = "BNO operation endpoints")
open class CorbeansBmnsBnoBaseController : CorbeansBmnsBaseController() {

    open fun activateMembership(
            @PathVariable nodeName: Optional<String>,
            @RequestBody input: MembershipPartiesMessage): MembershipState<*> =
            getBmnsService(nodeName).activateMembership(input)

    open fun suspendMembership(
            @PathVariable nodeName: Optional<String>,
            @RequestBody input: MembershipPartiesMessage): MembershipState<*> =
            getBmnsService(nodeName).suspendMembership(input)

}
