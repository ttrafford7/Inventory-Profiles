/*
 * Inventory Profiles Next
 *
 *   Copyright (c) 2019-2020 jsnimda <7615255+jsnimda@users.noreply.github.com>
 *   Copyright (c) 2021-2022 Plamen K. Kosseff <p.kosseff@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.anti_ad.mc.common.vanilla.alias

import net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.inventory.CraftingInventory
import net.minecraft.inventory.CraftingResultInventory
import net.minecraft.inventory.Inventory


import net.minecraft.container.Container
import net.minecraft.container.AnvilContainer
import net.minecraft.container.AbstractFurnaceContainer
import net.minecraft.container.Slot
import net.minecraft.container.TradeOutputSlot
import net.minecraft.container.CraftingResultSlot
import net.minecraft.container.FurnaceContainer
import net.minecraft.container.SlotActionType
import net.minecraft.container.BeaconContainer
import net.minecraft.container.BlastFurnaceContainer
import net.minecraft.container.BrewingStandContainer
import net.minecraft.container.CartographyTableContainer
import net.minecraft.container.CraftingTableContainer
import net.minecraft.container.EnchantingTableContainer
import net.minecraft.container.Generic3x3Container
import net.minecraft.container.GenericContainer
import net.minecraft.container.GrindstoneContainer
import net.minecraft.container.HopperContainer
import net.minecraft.container.HorseContainer
import net.minecraft.container.LecternContainer
import net.minecraft.container.LoomContainer
import net.minecraft.container.MerchantContainer
import net.minecraft.container.PlayerContainer
import net.minecraft.container.ShulkerBoxContainer
import net.minecraft.container.SmokerContainer
import net.minecraft.container.StonecutterContainer
import org.anti_ad.mc.common.vanilla.Vanilla

import org.anti_ad.mc.ipnext.inventory.ContainerType
import org.anti_ad.mc.ipnext.inventory.nonStorage
import org.anti_ad.mc.ipnext.inventory.playerOnly

//import net.minecraft.village.TraderInventory

typealias Container = Container
typealias CreativeContainer = CreativeInventoryScreen.CreativeContainer
typealias AbstractFurnaceContainer = AbstractFurnaceContainer
typealias AnvilContainer = AnvilContainer
typealias BeaconContainer = BeaconContainer
typealias BrewingStandContainer = BrewingStandContainer
typealias CartographyTableContainer = CartographyTableContainer
typealias CraftingTableContainer = CraftingTableContainer
typealias EnchantingTableContainer = EnchantingTableContainer
typealias Generic3x3Container = Generic3x3Container
typealias GenericContainer = GenericContainer
typealias GrindstoneContainer = GrindstoneContainer
typealias HopperContainer = HopperContainer
typealias HorseContainer = HorseContainer
typealias LecternContainer = LecternContainer
typealias LoomContainer = LoomContainer
typealias MerchantContainer = MerchantContainer
typealias PlayerContainer = PlayerContainer
typealias ShulkerBoxContainer = ShulkerBoxContainer
typealias StonecutterContainer = StonecutterContainer

typealias Inventory = Inventory
typealias PlayerInventory = PlayerInventory
typealias CraftingInventory = CraftingInventory
typealias CraftingResultInventory = CraftingResultInventory
//typealias TraderInventory = TraderInventory

typealias Slot = Slot
typealias TradeOutputSlot = TradeOutputSlot
typealias CraftingResultSlot = CraftingResultSlot

typealias SlotActionType = SlotActionType

val vanillaContainers = listOf<Class<*>>(PlayerContainer::class.java,
                                         CreativeContainer::class.java,
                                         EnchantingTableContainer::class.java,
                                         AnvilContainer::class.java,
                                         BeaconContainer::class.java,
                                         CartographyTableContainer::class.java,
                                         GrindstoneContainer::class.java,
                                         LecternContainer::class.java,
                                         LoomContainer::class.java,
                                         StonecutterContainer::class.java,
                                         MerchantContainer::class.java,
                                         CraftingTableContainer::class.java,
                                         HopperContainer::class.java,
                                         BrewingStandContainer::class.java,
                                         AbstractFurnaceContainer::class.java,
                                         FurnaceContainer::class.java,
                                         GenericContainer::class.java,
                                         ShulkerBoxContainer::class.java,
                                         HorseContainer::class.java,
                                         Generic3x3Container::class.java)

val versionSpecificContainerTypes = setOf(PlayerContainer::class.java           /**/ to playerOnly,
                                          CreativeContainer::class.java         /**/ to setOf(ContainerType.PURE_BACKPACK,
                                                                                              ContainerType.CREATIVE),

                                          EnchantingTableContainer::class.java  /**/ to nonStorage,
                                          AnvilContainer::class.java            /**/ to nonStorage,
                                          BeaconContainer::class.java           /**/ to nonStorage,
                                          BlastFurnaceContainer::class.java     /**/ to nonStorage,
                                          CartographyTableContainer::class.java /**/ to nonStorage,
                                          FurnaceContainer::class.java          /**/ to nonStorage,
                                          GrindstoneContainer::class.java       /**/ to nonStorage,
                                          LecternContainer::class.java          /**/ to nonStorage,
                                          LoomContainer::class.java             /**/ to nonStorage,
                                          StonecutterContainer::class.java      /**/ to setOf(ContainerType.PURE_BACKPACK,
                                                                                              ContainerType.STONECUTTER),
                                          SmokerContainer::class.java           /**/ to nonStorage,

                                          MerchantContainer::class.java         /**/ to setOf(ContainerType.TRADER),
                                          CraftingTableContainer::class.java    /**/ to setOf(ContainerType.CRAFTING),

                                          HopperContainer::class.java           /**/ to setOf(ContainerType.NO_SORTING_STORAGE,
                                                                                              ContainerType.PURE_BACKPACK), //setOf(ContainerType.NO_SORTING_STORAGE),
                                          BrewingStandContainer::class.java     /**/ to nonStorage, //setOf(ContainerType.NO_SORTING_STORAGE),
                                          AbstractFurnaceContainer::class.java  /**/ to nonStorage, //setOf(ContainerType.NO_SORTING_STORAGE),

                                          GenericContainer::class.java          /**/ to setOf(ContainerType.SORTABLE_STORAGE,
                                                                                              ContainerType.RECTANGULAR,
                                                                                              ContainerType.WIDTH_9),
                                          ShulkerBoxContainer::class.java       /**/ to setOf(ContainerType.SORTABLE_STORAGE,
                                                                                              ContainerType.RECTANGULAR,
                                                                                              ContainerType.WIDTH_9),
                                          HorseContainer::class.java            /**/ to setOf(ContainerType.SORTABLE_STORAGE,
                                                                                              ContainerType.RECTANGULAR,
                                                                                              ContainerType.HEIGHT_3,
                                                                                              ContainerType.HORSE_STORAGE),
                                          Generic3x3Container::class.java       /**/ to setOf(ContainerType.SORTABLE_STORAGE,
                                                                                              ContainerType.RECTANGULAR,
                                                                                              ContainerType.HEIGHT_3)).toTypedArray()

var selectPostAction: () -> Unit = {}
var selectPreAction: () -> Unit = {}

fun StonecutterContainer.selectRecipe(id: Int) {
    selectPreAction()
    Vanilla.queueForMainThread {
        onButtonClick(Vanilla.player(), id)
        Vanilla.mc().interactionManager.clickButton(syncId, id)
        Vanilla.queueForMainThread {
            selectPostAction()
        }
    }
}
